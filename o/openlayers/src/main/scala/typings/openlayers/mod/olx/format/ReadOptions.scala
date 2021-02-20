package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOptions extends StObject {
  
  var dataProjection: ProjectionLike = js.native
  
  var featureProjection: ProjectionLike = js.native
}
object ReadOptions {
  
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
    
    @scala.inline
    def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
  }
}
