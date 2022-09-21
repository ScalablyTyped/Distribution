package typings.mcrypt

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mcrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mcrypt", "MCrypt")
  @js.native
  open class MCrypt protected () extends StObject {
    def this(algorithm: String, mode: String) = this()
    
    def decrypt(ciphertext: Buffer): Buffer = js.native
    
    def encrypt(plaintext: String): Buffer = js.native
    def encrypt(plaintext: Buffer): Buffer = js.native
    
    def generateIv(): Buffer = js.native
    
    def getAlgorithmName(): String = js.native
    
    def getBlockSize(): Double = js.native
    
    def getIvSize(): Double = js.native
    
    def getKeySize(): Double = js.native
    
    def getModeName(): String = js.native
    
    def getSupportedKeySizes(): js.Array[Double] = js.native
    
    def hasIv(): Boolean = js.native
    
    def isBlockAlgorithm(): Boolean = js.native
    
    def isBlockAlgorithmMode(): Boolean = js.native
    
    def isBlockMode(): Boolean = js.native
    
    def open(key: String): Unit = js.native
    def open(key: String, iv: String): Unit = js.native
    def open(key: String, iv: Buffer): Unit = js.native
    def open(key: Buffer): Unit = js.native
    def open(key: Buffer, iv: String): Unit = js.native
    def open(key: Buffer, iv: Buffer): Unit = js.native
    
    def selfTest(): Boolean = js.native
    
    def validateIvSize(validate: Boolean): Unit = js.native
    
    def validateKeySize(validate: Boolean): Unit = js.native
  }
  
  inline def getAlgorithmNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmNames")().asInstanceOf[js.Array[String]]
  
  inline def getModeNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModeNames")().asInstanceOf[js.Array[String]]
}
