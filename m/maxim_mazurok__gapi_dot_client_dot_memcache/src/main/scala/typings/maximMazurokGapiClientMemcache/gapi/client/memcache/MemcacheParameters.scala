package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemcacheParameters extends StObject {
  
  /**
    * Output only. The unique ID associated with this set of parameters. Users can use this id to determine if the parameters associated with the instance differ from the parameters
    * associated with the nodes. A discrepancy between parameter ids can inform users that they may need to take action to apply parameters on nodes.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** User defined set of parameters to use in the memcached process. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object MemcacheParameters {
  
  inline def apply(): MemcacheParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemcacheParameters]
  }
  
  extension [Self <: MemcacheParameters](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
