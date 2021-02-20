package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemcacheParameters extends StObject {
  
  /**
    * Output only. The unique ID associated with this set of parameters. Users can use this id to determine if the parameters associated with the instance differ from the parameters
    * associated with the nodes and any action needs to be taken to apply parameters on nodes.
    */
  var id: js.UndefOr[String] = js.native
  
  /** User defined set of parameters to use in the memcached process. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.MemcacheParameters with TopLevel[js.Any]
  ] = js.native
}
object MemcacheParameters {
  
  @scala.inline
  def apply(): MemcacheParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemcacheParameters]
  }
  
  @scala.inline
  implicit class MemcacheParametersMutableBuilder[Self <: MemcacheParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.MemcacheParameters with TopLevel[js.Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
