package typings.openui5.sapNs.uiNs.coreNs.mvcNs.XMLViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PreprocessorType extends js.Object

/**
  * Specifies the available preprocessor types for XMLViews
  */
@JSGlobal("sap.ui.core.mvc.XMLView.PreprocessorType")
@js.native
object PreprocessorType extends js.Object {
  @js.native
  sealed trait CONTROLS extends PreprocessorType
  
  @js.native
  sealed trait VIEWXML extends PreprocessorType
  
  @js.native
  sealed trait XML extends PreprocessorType
  
  /* 0 */ val CONTROLS: typings.openui5.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType.CONTROLS with Double = js.native
  /* 1 */ val VIEWXML: typings.openui5.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType.VIEWXML with Double = js.native
  /* 2 */ val XML: typings.openui5.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PreprocessorType with Double] = js.native
}

