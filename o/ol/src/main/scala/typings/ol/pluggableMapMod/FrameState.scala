package typings.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.olMod.Transform
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameState extends js.Object {
  
  var animate: Boolean = js.native
  
  var coordinateToPixelTransform: Transform = js.native
  
  var declutterItems: js.Array[DeclutterItems] = js.native
  
  var extent: Extent = js.native
  
  var index: Double = js.native
  
  var layerIndex: Double = js.native
  
  var layerStatesArray: js.Array[State] = js.native
  
  var pixelRatio: Double = js.native
  
  var pixelToCoordinateTransform: Transform = js.native
  
  var postRenderFunctions: js.Array[PostRenderFunction] = js.native
  
  var size: Size = js.native
  
  var tileQueue: typings.ol.tileQueueMod.default = js.native
  
  var time: Double = js.native
  
  var usedTiles: StringDictionary[StringDictionary[Boolean]] = js.native
  
  var viewHints: js.Array[Double] = js.native
  
  var viewState: typings.ol.viewMod.State = js.native
  
  var wantedTiles: StringDictionary[StringDictionary[Boolean]] = js.native
}
object FrameState {
  
  @scala.inline
  def apply(
    animate: Boolean,
    coordinateToPixelTransform: Transform,
    declutterItems: js.Array[DeclutterItems],
    extent: Extent,
    index: Double,
    layerIndex: Double,
    layerStatesArray: js.Array[State],
    pixelRatio: Double,
    pixelToCoordinateTransform: Transform,
    postRenderFunctions: js.Array[PostRenderFunction],
    size: Size,
    tileQueue: typings.ol.tileQueueMod.default,
    time: Double,
    usedTiles: StringDictionary[StringDictionary[Boolean]],
    viewHints: js.Array[Double],
    viewState: typings.ol.viewMod.State,
    wantedTiles: StringDictionary[StringDictionary[Boolean]]
  ): FrameState = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], declutterItems = declutterItems.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerIndex = layerIndex.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameState]
  }
  
  @scala.inline
  implicit class FrameStateOps[Self <: FrameState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateToPixelTransformVarargs(value: Double*): Self = this.set("coordinateToPixelTransform", js.Array(value :_*))
    
    @scala.inline
    def setCoordinateToPixelTransform(value: Transform): Self = this.set("coordinateToPixelTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclutterItemsVarargs(value: DeclutterItems*): Self = this.set("declutterItems", js.Array(value :_*))
    
    @scala.inline
    def setDeclutterItems(value: js.Array[DeclutterItems]): Self = this.set("declutterItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIndex(value: Double): Self = this.set("layerIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerStatesArrayVarargs(value: State*): Self = this.set("layerStatesArray", js.Array(value :_*))
    
    @scala.inline
    def setLayerStatesArray(value: js.Array[State]): Self = this.set("layerStatesArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelToCoordinateTransformVarargs(value: Double*): Self = this.set("pixelToCoordinateTransform", js.Array(value :_*))
    
    @scala.inline
    def setPixelToCoordinateTransform(value: Transform): Self = this.set("pixelToCoordinateTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostRenderFunctionsVarargs(value: PostRenderFunction*): Self = this.set("postRenderFunctions", js.Array(value :_*))
    
    @scala.inline
    def setPostRenderFunctions(value: js.Array[PostRenderFunction]): Self = this.set("postRenderFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileQueue(value: typings.ol.tileQueueMod.default): Self = this.set("tileQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = this.set("usedTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHintsVarargs(value: Double*): Self = this.set("viewHints", js.Array(value :_*))
    
    @scala.inline
    def setViewHints(value: js.Array[Double]): Self = this.set("viewHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewState(value: typings.ol.viewMod.State): Self = this.set("viewState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = this.set("wantedTiles", value.asInstanceOf[js.Any])
  }
}
