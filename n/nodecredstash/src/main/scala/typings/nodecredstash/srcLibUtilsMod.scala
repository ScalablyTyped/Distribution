package typings.nodecredstash

import typings.nodecredstash.nodecredstashInts.`0`
import typings.nodecredstash.nodecredstashInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibUtilsMod {
  
  @JSImport("nodecredstash/src/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paddedInt(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paddedInt")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pause(timeout: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def sanitizeVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")().asInstanceOf[String]
  inline def sanitizeVersion(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeVersion(version: String, defaultVersion: `0` | `1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any], defaultVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sanitizeVersion(version: String, defaultVersion: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any], defaultVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sanitizeVersion(version: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeVersion(version: Double, defaultVersion: `0` | `1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any], defaultVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sanitizeVersion(version: Double, defaultVersion: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any], defaultVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sanitizeVersion(version: Unit, defaultVersion: `0` | `1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any], defaultVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sanitizeVersion(version: Unit, defaultVersion: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeVersion")(version.asInstanceOf[js.Any], defaultVersion.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sortSecrets(a: SortableSecret, b: SortableSecret): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortSecrets")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait SortableSecret extends StObject {
    
    var name: String
    
    var version: String
  }
  object SortableSecret {
    
    inline def apply(name: String, version: String): SortableSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortableSecret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortableSecret] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
