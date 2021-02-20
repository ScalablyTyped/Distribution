package typings.openui5.sap.ui.model.odata

import typings.openui5.sap.ui.model.Context
import typings.openui5.sap.ui.model.ListBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataListBinding extends ListBinding {
  
  def getContexts(iStartIndex: Double, iLength: js.UndefOr[scala.Nothing], iThreshold: Double): js.Array[Context] = js.native
  def getContexts(iStartIndex: Double, iLength: Double, iThreshold: Double): js.Array[Context] = js.native
  
  /**
    * Get a download URL with the specified format considering thesort/filter/custom parameters.
    * @since 1.24
    * @param sFormat Value for the $format Parameter
    * @returns URL which can be used for downloading
    */
  def getDownloadUrl(sFormat: String): String = js.native
}
