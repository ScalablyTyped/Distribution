package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsmExternals extends StObject {
  
  var appDir: String
  
  var appDirEnabled: js.UndefOr[Boolean] = js.undefined
  
  var esmExternals: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['esmExternals'] */ js.Any
  ] = js.undefined
  
  var excludeFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var outputFileTracingRoot: js.UndefOr[String] = js.undefined
  
  var turbotrace: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['turbotrace'] */ js.Any
  ] = js.undefined
}
object EsmExternals {
  
  inline def apply(appDir: String): EsmExternals = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsmExternals]
  }
  
  extension [Self <: EsmExternals](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirEnabled(value: Boolean): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
    
    inline def setAppDirEnabledUndefined: Self = StObject.set(x, "appDirEnabled", js.undefined)
    
    inline def setEsmExternals(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['esmExternals'] */ js.Any
    ): Self = StObject.set(x, "esmExternals", value.asInstanceOf[js.Any])
    
    inline def setEsmExternalsUndefined: Self = StObject.set(x, "esmExternals", js.undefined)
    
    inline def setExcludeFiles(value: js.Array[String]): Self = StObject.set(x, "excludeFiles", value.asInstanceOf[js.Any])
    
    inline def setExcludeFilesUndefined: Self = StObject.set(x, "excludeFiles", js.undefined)
    
    inline def setExcludeFilesVarargs(value: String*): Self = StObject.set(x, "excludeFiles", js.Array(value*))
    
    inline def setOutputFileTracingRoot(value: String): Self = StObject.set(x, "outputFileTracingRoot", value.asInstanceOf[js.Any])
    
    inline def setOutputFileTracingRootUndefined: Self = StObject.set(x, "outputFileTracingRoot", js.undefined)
    
    inline def setTurbotrace(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['turbotrace'] */ js.Any
    ): Self = StObject.set(x, "turbotrace", value.asInstanceOf[js.Any])
    
    inline def setTurbotraceUndefined: Self = StObject.set(x, "turbotrace", js.undefined)
  }
}
