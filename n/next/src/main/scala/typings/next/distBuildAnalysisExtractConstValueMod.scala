package typings.next

import typings.std.Error
import typings.swcCore.typesMod.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildAnalysisExtractConstValueMod {
  
  @JSImport("next/dist/build/analysis/extract-const-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/build/analysis/extract-const-value", "NoSuchDeclarationError")
  @js.native
  open class NoSuchDeclarationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/build/analysis/extract-const-value", "UnsupportedValueError")
  @js.native
  open class UnsupportedValueError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, paths: js.Array[String]) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /** @example `config.runtime[0].value` */
    var path: js.UndefOr[String] = js.native
  }
  
  inline def extractExportedConstValue(module: Module, exportedName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extractExportedConstValue")(module.asInstanceOf[js.Any], exportedName.asInstanceOf[js.Any])).asInstanceOf[Any]
}
