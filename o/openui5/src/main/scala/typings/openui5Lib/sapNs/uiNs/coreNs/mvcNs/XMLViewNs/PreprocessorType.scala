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
  
  val CONTROLS: CONTROLS with java.lang.String = js.native
  val VIEWXML: VIEWXML with java.lang.String = js.native
  val XML: XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType with java.lang.String
  ] = js.native
}

