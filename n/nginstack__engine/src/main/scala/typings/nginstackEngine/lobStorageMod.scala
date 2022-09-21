package typings.nginstackEngine

import typings.nginstackEngine.anon.ExtraAttributes
import typings.nginstackEngine.anon.FileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lobStorageMod {
  
  inline def apply(classKey: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(classKey: typings.nginstackEngine.dbkeyMod.^): Unit = ^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/LobStorage", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LobStorage {
    def this(classKey: Double) = this()
    def this(classKey: typings.nginstackEngine.dbkeyMod.^) = this()
  }
  @JSImport("@nginstack/engine/lib/database/LobStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait LobStorage extends StObject {
    
    def addLob(fileName: String, content: String, options: Unit, args: Any*): Double = js.native
    def addLob(fileName: String, content: String, options: ExtraAttributes, args: Any*): Double = js.native
    
    /* private */ var batchChanges_ : Any = js.native
    
    def beginBatch(): Unit = js.native
    
    var classKey: Double = js.native
    
    /* private */ var compress_ : Any = js.native
    
    /* private */ var decode_ : Any = js.native
    
    /* private */ var decompress_ : Any = js.native
    
    def deleteLob(key: Double): Boolean = js.native
    
    /* private */ var encode_ : Any = js.native
    
    def endBatch(): Any = js.native
    
    def getLob(key: Double): typings.nginstackEngine.largeObjectMod.^ = js.native
    
    def getLobExtraAttributes(key: Double): Any = js.native
    
    /* private */ var prepareContent_ : Any = js.native
    
    def setLobExtraAttributes(key: Double, extraAttributes: Any): Unit = js.native
    
    /* private */ var tryCompress_ : Any = js.native
    
    def tryGetLob(key: Double): typings.nginstackEngine.largeObjectMod.^ = js.native
    
    def updateLob(key: Double, content: String, options: Unit, args: Any*): Unit = js.native
    def updateLob(key: Double, content: String, options: FileName, args: Any*): Unit = js.native
  }
}
