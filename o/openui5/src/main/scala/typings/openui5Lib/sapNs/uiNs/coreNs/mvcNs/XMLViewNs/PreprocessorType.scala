package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs

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
  sealed trait CONTROLS
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType
  
  @js.native
  sealed trait VIEWXML
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType
  
  @js.native
  sealed trait XML
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType
  
  /* 0 */ val CONTROLS: CONTROLS with scala.Double = js.native
  /* 1 */ val VIEWXML: VIEWXML with scala.Double = js.native
  /* 2 */ val XML: XML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType with scala.Double] = js.native
}

