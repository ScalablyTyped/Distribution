package typings.ol.imageArcGISRestMod

import typings.ol.olImageMod.LoadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageArcGISRest
  extends typings.ol.sourceImageMod.default {
  
  /**
    * Return the image load function of the source.
    */
  def getImageLoadFunction(): LoadFunction = js.native
  
  /**
    * Get the user-provided params, i.e. those passed to the constructor through
    * the "params" option, and possibly updated using the updateParams method.
    */
  def getParams(): js.Any = js.native
  
  /**
    * Return the URL used for this ArcGIS source.
    */
  def getUrl(): js.UndefOr[String] = js.native
  
  /**
    * Set the image load function of the source.
    */
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  
  /**
    * Set the URL to use for requests.
    */
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  
  /**
    * Update the user-provided params.
    */
  def updateParams(params: js.Any): Unit = js.native
}
