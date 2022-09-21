package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/product/ProductManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ProductManager
  @JSImport("@nginstack/engine/lib/product/ProductManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): ProductManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ProductManager]
  
  type DBKey = typings.nginstackEngine.dbkeyMod.^
  
  @js.native
  trait ProductManager extends StObject {
    
    def authenticatePassword(product: Double, password: String): Boolean = js.native
    
    def changePassword(product: Double, currentPassword: String, newPassword: String): Unit = js.native
    
    def createProduct(productInfo: Any, userId: String, password: String): String = js.native
    
    def enableDevelopment(productStream: String, password: String): Unit = js.native
    
    def getChangeableProducts(userKey: Double): js.Array[Any] = js.native
    
    def getProductFromKey(key: Double): Double | Null = js.native
    
    def getProductNameFromKey(key: Double): String = js.native
    
    def setChangeableProducts(userKey: Double, products: js.Array[Any], passwords: js.Array[Any]): Unit = js.native
    
    def userCanChangeRecord(recordKey: Double, userKey: Double): Boolean = js.native
    def userCanChangeRecord(recordKey: Double, userKey: DBKey): Boolean = js.native
    def userCanChangeRecord(recordKey: DBKey, userKey: Double): Boolean = js.native
    def userCanChangeRecord(recordKey: DBKey, userKey: DBKey): Boolean = js.native
  }
}
