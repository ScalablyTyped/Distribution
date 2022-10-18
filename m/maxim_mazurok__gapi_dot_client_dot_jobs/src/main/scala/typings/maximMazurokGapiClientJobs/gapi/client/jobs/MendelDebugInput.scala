package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MendelDebugInput extends StObject {
  
  /**
    * When a request spans multiple servers, a MendelDebugInput may travel with the request and take effect in all the servers. This field is a map of namespaces to
    * NamespacedMendelDebugInput protos. In a single server, up to two NamespacedMendelDebugInput protos are applied: 1. NamespacedMendelDebugInput with the global namespace (key == "").
    * 2. NamespacedMendelDebugInput with the server's namespace. When both NamespacedMendelDebugInput protos are present, they are merged. See go/mendel-debug-forcing for more details.
    */
  var namespacedDebugInput: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.jobs.gapi.client.jobs.NamespacedDebugInput} */ js.Any
  ] = js.undefined
}
object MendelDebugInput {
  
  inline def apply(): MendelDebugInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MendelDebugInput]
  }
  
  extension [Self <: MendelDebugInput](x: Self) {
    
    inline def setNamespacedDebugInput(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.jobs.gapi.client.jobs.NamespacedDebugInput} */ js.Any
    ): Self = StObject.set(x, "namespacedDebugInput", value.asInstanceOf[js.Any])
    
    inline def setNamespacedDebugInputUndefined: Self = StObject.set(x, "namespacedDebugInput", js.undefined)
  }
}
