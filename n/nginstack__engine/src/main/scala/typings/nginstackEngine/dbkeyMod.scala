package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbkeyMod {
  
  inline def apply(key: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dbkey/DBKey", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DBKey {
    def this(key: Any) = this()
  }
  @JSImport("@nginstack/engine/lib/dbkey/DBKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals_(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: String, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: String, b: DBKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: Double, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: Double, b: DBKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: DBKey, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: DBKey, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: DBKey, b: DBKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def from(value: Any): DBKey = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[DBKey]
  
  inline def isLike(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLike")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait DBKey extends StObject {
    
    def bool(expr: String): Boolean = js.native
    
    def date(expr: String): js.Date | Null = js.native
    
    def dbkey(expr: String): DBKey | Null = js.native
    
    def equals(value: String): Boolean = js.native
    def equals(value: Double): Boolean = js.native
    def equals(value: DBKey): Boolean = js.native
    
    def num(expr: String): Double = js.native
    
    def str(expr: String): String = js.native
    
    def `val`(expr: String): String | Double | Null | Boolean | js.Date = js.native
  }
}
