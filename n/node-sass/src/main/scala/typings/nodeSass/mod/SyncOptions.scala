package typings.nodeSass.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncOptions extends Options {
  
  @JSName("functions")
  var functions_SyncOptions: js.UndefOr[FunctionDeclarations[SyncSassFunction]] = js.native
  
  @JSName("importer")
  var importer_SyncOptions: js.UndefOr[SyncImporter | js.Array[SyncImporter]] = js.native
}
object SyncOptions {
  
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  @scala.inline
  implicit class SyncOptionsMutableBuilder[Self <: SyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: FunctionDeclarations[SyncSassFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setImporter(value: SyncImporter | js.Array[SyncImporter]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    @scala.inline
    def setImporterVarargs(value: SyncImporter*): Self = StObject.set(x, "importer", js.Array(value :_*))
  }
}
