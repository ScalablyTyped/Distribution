package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathConstraint extends Updatable {
  
  var active: Boolean = js.native
  
  def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  
  def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  
  def addCurvePosition(
    p: Double,
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    out: js.Array[Double],
    o: Double,
    tangents: Boolean
  ): Unit = js.native
  
  @JSName("apply")
  def apply(): Unit = js.native
  
  var bones: js.Array[Bone] = js.native
  
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
  
  var curves: js.Array[Double] = js.native
  
  var data: PathConstraintData = js.native
  
  var lengths: js.Array[Double] = js.native
  
  var position: Double = js.native
  
  var positions: js.Array[Double] = js.native
  
  var rotateMix: Double = js.native
  
  var segments: js.Array[Double] = js.native
  
  var spaces: js.Array[Double] = js.native
  
  var spacing: Double = js.native
  
  var target: Slot = js.native
  
  var translateMix: Double = js.native
  
  var world: js.Array[Double] = js.native
}
object PathConstraint {
  
  @scala.inline
  def apply(
    active: Boolean,
    addAfterPosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit,
    addBeforePosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit,
    addCurvePosition: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Unit,
    apply: () => Unit,
    bones: js.Array[Bone],
    computeWorldPositions: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double],
    curves: js.Array[Double],
    data: PathConstraintData,
    isActive: () => Boolean,
    lengths: js.Array[Double],
    position: Double,
    positions: js.Array[Double],
    rotateMix: Double,
    segments: js.Array[Double],
    spaces: js.Array[Double],
    spacing: Double,
    target: Slot,
    translateMix: Double,
    update: () => Unit,
    world: js.Array[Double]
  ): PathConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAfterPosition = js.Any.fromFunction5(addAfterPosition), addBeforePosition = js.Any.fromFunction5(addBeforePosition), addCurvePosition = js.Any.fromFunction12(addCurvePosition), apply = js.Any.fromFunction0(apply), bones = bones.asInstanceOf[js.Any], computeWorldPositions = js.Any.fromFunction5(computeWorldPositions), curves = curves.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), lengths = lengths.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraint]
  }
  
  @scala.inline
  implicit class PathConstraintOps[Self <: PathConstraint] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAfterPosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit): Self = this.set("addAfterPosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddBeforePosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit): Self = this.set("addBeforePosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddCurvePosition(
      value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Unit
    ): Self = this.set("addCurvePosition", js.Any.fromFunction12(value))
    
    @scala.inline
    def setApply(value: () => Unit): Self = this.set("apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBonesVarargs(value: Bone*): Self = this.set("bones", js.Array(value :_*))
    
    @scala.inline
    def setBones(value: js.Array[Bone]): Self = this.set("bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeWorldPositions(value: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double]): Self = this.set("computeWorldPositions", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCurvesVarargs(value: Double*): Self = this.set("curves", js.Array(value :_*))
    
    @scala.inline
    def setCurves(value: js.Array[Double]): Self = this.set("curves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: PathConstraintData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthsVarargs(value: Double*): Self = this.set("lengths", js.Array(value :_*))
    
    @scala.inline
    def setLengths(value: js.Array[Double]): Self = this.set("lengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateMix(value: Double): Self = this.set("rotateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: Double*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[Double]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesVarargs(value: Double*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[Double]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Slot): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateMix(value: Double): Self = this.set("translateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldVarargs(value: Double*): Self = this.set("world", js.Array(value :_*))
    
    @scala.inline
    def setWorld(value: js.Array[Double]): Self = this.set("world", value.asInstanceOf[js.Any])
  }
}
