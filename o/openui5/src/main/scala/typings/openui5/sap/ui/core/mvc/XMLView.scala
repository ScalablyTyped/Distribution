package typings.openui5.sap.ui.core.mvc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLView extends View {
  /**
    * Flag for feature detection of asynchronous loading/rendering
    * @since 1.30
    */
  var asyncSupport: js.Any = js.native
}

@JSGlobal("sap.ui.core.mvc.XMLView")
@js.native
object XMLView extends js.Object {
  @js.native
  sealed trait PreprocessorType extends js.Object
  
  /**
    * Specifies the available preprocessor types for XMLViews
    */
  @js.native
  object PreprocessorType extends js.Object {
    @js.native
    sealed trait CONTROLS extends PreprocessorType
    
    @js.native
    sealed trait VIEWXML extends PreprocessorType
    
    @js.native
    sealed trait XML extends PreprocessorType
    
  }
  
}

