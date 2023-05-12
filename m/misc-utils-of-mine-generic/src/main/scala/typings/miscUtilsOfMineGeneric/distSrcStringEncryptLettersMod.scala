package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringEncryptLettersMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/encryptLetters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptLetters(config: EncryptLettersConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptLetters")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encryptLetters(config: EncryptLettersConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptLetters")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait EncryptLettersConfig extends StObject {
    
    var input: String
    
    /** array of integers, each of them will be randomize each char of the input so it needs to be the same length as input */
    var password: js.Array[Double]
    
    /** the valid set of charts for encoding/decoding */
    var universe: String
  }
  object EncryptLettersConfig {
    
    inline def apply(input: String, password: js.Array[Double], universe: String): EncryptLettersConfig = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], universe = universe.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptLettersConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptLettersConfig] (val x: Self) extends AnyVal {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: js.Array[Double]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordVarargs(value: Double*): Self = StObject.set(x, "password", js.Array(value*))
      
      inline def setUniverse(value: String): Self = StObject.set(x, "universe", value.asInstanceOf[js.Any])
    }
  }
}
