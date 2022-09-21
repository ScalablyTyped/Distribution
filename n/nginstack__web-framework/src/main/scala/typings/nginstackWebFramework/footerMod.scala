package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.CalculatedWidth
import typings.nginstackWebFramework.anon.Colspan
import typings.nginstackWebFramework.anon.Write
import typings.nginstackWebFramework.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/Footer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Footer
  @JSImport("@nginstack/web-framework/lib/simple-layout/Footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Footer extends StObject {
    
    var autoSanitize: Boolean = js.native
    
    var complement: String = js.native
    
    /* private */ var cssExtractor_ : Any = js.native
    
    var image: Double | Null = js.native
    
    var mustIncludeCssFiles: Boolean = js.native
    
    var showPath: Boolean = js.native
    
    var visible: Boolean = js.native
    
    def writeHtml(sender: SimpleLayout, outputObj: `0`): Unit = js.native
    def writeHtml(sender: SimpleLayout, outputObj: `0`, opt_options: Colspan): Unit = js.native
    def writeHtml(sender: Visualization, outputObj: `0`): Unit = js.native
    def writeHtml(sender: Visualization, outputObj: `0`, opt_options: Colspan): Unit = js.native
    
    def writePlain(outputObj: Write, options: CalculatedWidth): Unit = js.native
  }
  
  type Mail = typings.nginstackEngine.mailMod.^
  
  type SimpleLayout = typings.nginstackWebFramework.simpleLayoutMod.^
  
  type Visualization = typings.nginstackWebFramework.visualizationMod.^
}
