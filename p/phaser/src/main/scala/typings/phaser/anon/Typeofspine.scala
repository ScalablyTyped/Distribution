package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.phaser.spine.AnimationState
import typings.phaser.spine.AnimationStateAdapter2
import typings.phaser.spine.AnimationStateData
import typings.phaser.spine.AtlasAttachmentLoader
import typings.phaser.spine.Attachment
import typings.phaser.spine.AttachmentTimeline
import typings.phaser.spine.Bone
import typings.phaser.spine.BoneData
import typings.phaser.spine.BoundingBoxAttachment
import typings.phaser.spine.ClippingAttachment
import typings.phaser.spine.ConstraintData
import typings.phaser.spine.DeformTimeline
import typings.phaser.spine.DrawOrderTimeline
import typings.phaser.spine.Event
import typings.phaser.spine.EventData
import typings.phaser.spine.EventQueue
import typings.phaser.spine.EventTimeline
import typings.phaser.spine.FakeTexture
import typings.phaser.spine.IkConstraint
import typings.phaser.spine.IkConstraintData
import typings.phaser.spine.IntSet
import typings.phaser.spine.Interpolation
import typings.phaser.spine.JitterEffect
import typings.phaser.spine.MeshAttachment
import typings.phaser.spine.PathAttachment
import typings.phaser.spine.PathConstraintData
import typings.phaser.spine.PathConstraintSpacingTimeline
import typings.phaser.spine.PointAttachment
import typings.phaser.spine.Pool
import typings.phaser.spine.Pow
import typings.phaser.spine.PowOut
import typings.phaser.spine.ScaleTimeline
import typings.phaser.spine.SharedAssetManager
import typings.phaser.spine.ShearTimeline
import typings.phaser.spine.Skeleton
import typings.phaser.spine.SkeletonBounds
import typings.phaser.spine.SkeletonData
import typings.phaser.spine.Skin
import typings.phaser.spine.SkinEntry
import typings.phaser.spine.Slot
import typings.phaser.spine.SlotData
import typings.phaser.spine.TextureAtlas
import typings.phaser.spine.TextureAtlasPage
import typings.phaser.spine.TextureAtlasRegion
import typings.phaser.spine.TextureRegion
import typings.phaser.spine.TimeKeeper
import typings.phaser.spine.TrackEntry
import typings.phaser.spine.TransformConstraint
import typings.phaser.spine.TransformConstraintData
import typings.phaser.spine.Vector2
import typings.phaser.spine.WindowedMean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofspine extends js.Object {
  var Animation: TypeofAnimation = js.native
  var AnimationState: TypeofAnimationState = js.native
  var AnimationStateAdapter2: Instantiable0[typings.phaser.spine.AnimationStateAdapter2] = js.native
  var AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, typings.phaser.spine.AnimationStateData] = js.native
  var AssetManager: TypeofAssetManager = js.native
  var AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, typings.phaser.spine.AtlasAttachmentLoader] = js.native
  var Attachment: Instantiable1[/* name */ String, typings.phaser.spine.Attachment] = js.native
  var AttachmentTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.AttachmentTimeline] = js.native
  var Bone: Instantiable3[
    /* data */ BoneData, 
    /* skeleton */ Skeleton, 
    /* parent */ typings.phaser.spine.Bone, 
    typings.phaser.spine.Bone
  ] = js.native
  var BoneData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* parent */ typings.phaser.spine.BoneData, 
    typings.phaser.spine.BoneData
  ] = js.native
  var BoundingBoxAttachment: Instantiable1[/* name */ String, typings.phaser.spine.BoundingBoxAttachment] = js.native
  var ClippingAttachment: Instantiable1[/* name */ String, typings.phaser.spine.ClippingAttachment] = js.native
  var Color: TypeofColor = js.native
  var ColorTimeline: TypeofColorTimeline = js.native
  var ConstraintData: Instantiable3[
    /* name */ String, 
    /* order */ Double, 
    /* skinRequired */ Boolean, 
    typings.phaser.spine.ConstraintData
  ] = js.native
  var CurveTimeline: TypeofCurveTimeline = js.native
  var DebugUtils: TypeofDebugUtils = js.native
  var DeformTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.DeformTimeline] = js.native
  var DrawOrderTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.DrawOrderTimeline] = js.native
  var Event: Instantiable2[/* time */ Double, /* data */ EventData, typings.phaser.spine.Event] = js.native
  var EventData: Instantiable1[/* name */ String, typings.phaser.spine.EventData] = js.native
  var EventQueue: Instantiable1[/* animState */ AnimationState, typings.phaser.spine.EventQueue] = js.native
  var EventTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.EventTimeline] = js.native
  var FakeTexture: Instantiable0[typings.phaser.spine.FakeTexture] = js.native
  var IkConstraint: Instantiable2[
    /* data */ IkConstraintData, 
    /* skeleton */ Skeleton, 
    typings.phaser.spine.IkConstraint
  ] = js.native
  var IkConstraintData: Instantiable1[/* name */ String, typings.phaser.spine.IkConstraintData] = js.native
  var IkConstraintTimeline: TypeofIkConstraintTimelin = js.native
  var IntSet: Instantiable0[typings.phaser.spine.IntSet] = js.native
  var Interpolation: Instantiable0[typings.phaser.spine.Interpolation] = js.native
  var JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, typings.phaser.spine.JitterEffect] = js.native
  var MathUtils: TypeofMathUtils = js.native
  var MeshAttachment: Instantiable1[/* name */ String, typings.phaser.spine.MeshAttachment] = js.native
  var PathAttachment: Instantiable1[/* name */ String, typings.phaser.spine.PathAttachment] = js.native
  var PathConstraint: TypeofPathConstraint = js.native
  var PathConstraintData: Instantiable1[/* name */ String, typings.phaser.spine.PathConstraintData] = js.native
  var PathConstraintMixTimeline: TypeofPathConstraintMixTi = js.native
  var PathConstraintPositionTimeline: TypeofPathConstraintPosit = js.native
  var PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.PathConstraintSpacingTimeline] = js.native
  var PointAttachment: Instantiable1[/* name */ String, typings.phaser.spine.PointAttachment] = js.native
  var Pool: Instantiable1[
    /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.phaser.spine.Pool[js.Object]
  ] = js.native
  var Pow: Instantiable1[/* power */ Double, typings.phaser.spine.Pow] = js.native
  var PowOut: Instantiable1[/* power */ Double, typings.phaser.spine.PowOut] = js.native
  var RegionAttachment: TypeofRegionAttachment = js.native
  var RotateTimeline: TypeofRotateTimeline = js.native
  var ScaleTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.ScaleTimeline] = js.native
  var SharedAssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], typings.phaser.spine.SharedAssetManager] = js.native
  var ShearTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.ShearTimeline] = js.native
  var Skeleton: Instantiable1[/* data */ SkeletonData, typings.phaser.spine.Skeleton] = js.native
  var SkeletonBinary: TypeofSkeletonBinary = js.native
  var SkeletonBounds: Instantiable0[typings.phaser.spine.SkeletonBounds] = js.native
  var SkeletonClipping: TypeofSkeletonClipping = js.native
  var SkeletonData: Instantiable0[typings.phaser.spine.SkeletonData] = js.native
  var SkeletonJson: TypeofSkeletonJson = js.native
  var Skin: Instantiable1[/* name */ String, typings.phaser.spine.Skin] = js.native
  var SkinEntry: Instantiable3[
    /* slotIndex */ Double, 
    /* name */ String, 
    /* attachment */ Attachment, 
    typings.phaser.spine.SkinEntry
  ] = js.native
  var Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, typings.phaser.spine.Slot] = js.native
  var SlotData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* boneData */ BoneData, 
    typings.phaser.spine.SlotData
  ] = js.native
  var SwirlEffect: TypeofSwirlEffect = js.native
  var Texture: TypeofTexture = js.native
  var TextureAtlas: Instantiable2[
    /* atlasText */ String, 
    /* textureLoader */ js.Function1[/* path */ String, js.Any], 
    typings.phaser.spine.TextureAtlas
  ] = js.native
  var TextureAtlasPage: Instantiable0[typings.phaser.spine.TextureAtlasPage] = js.native
  var TextureAtlasRegion: Instantiable0[typings.phaser.spine.TextureAtlasRegion] = js.native
  var TextureRegion: Instantiable0[typings.phaser.spine.TextureRegion] = js.native
  var TimeKeeper: Instantiable0[typings.phaser.spine.TimeKeeper] = js.native
  var TrackEntry: Instantiable0[typings.phaser.spine.TrackEntry] = js.native
  var TransformConstraint: Instantiable2[
    /* data */ TransformConstraintData, 
    /* skeleton */ Skeleton, 
    typings.phaser.spine.TransformConstraint
  ] = js.native
  var TransformConstraintData: Instantiable1[/* name */ String, typings.phaser.spine.TransformConstraintData] = js.native
  var TransformConstraintTimeline: TypeofTransformConstraint = js.native
  var TranslateTimeline: TypeofTranslateTimeline = js.native
  var Triangulator: TypeofTriangulator = js.native
  var TwoColorTimeline: TypeofTwoColorTimeline = js.native
  var Utils: TypeofUtils = js.native
  var Vector2: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], typings.phaser.spine.Vector2] = js.native
  var VertexAttachment: TypeofVertexAttachment = js.native
  var WindowedMean: Instantiable1[/* windowSize */ js.UndefOr[Double], typings.phaser.spine.WindowedMean] = js.native
  val canvas: Typeofcanvas = js.native
  val webgl: Typeofwebgl = js.native
}

object Typeofspine {
  @scala.inline
  def apply(
    Animation: TypeofAnimation,
    AnimationState: TypeofAnimationState,
    AnimationStateAdapter2: Instantiable0[AnimationStateAdapter2],
    AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData],
    AssetManager: TypeofAssetManager,
    AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader],
    Attachment: Instantiable1[/* name */ String, Attachment],
    AttachmentTimeline: Instantiable1[/* frameCount */ Double, AttachmentTimeline],
    Bone: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone],
    BoneData: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData],
    BoundingBoxAttachment: Instantiable1[/* name */ String, BoundingBoxAttachment],
    ClippingAttachment: Instantiable1[/* name */ String, ClippingAttachment],
    Color: TypeofColor,
    ColorTimeline: TypeofColorTimeline,
    ConstraintData: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData],
    CurveTimeline: TypeofCurveTimeline,
    DebugUtils: TypeofDebugUtils,
    DeformTimeline: Instantiable1[/* frameCount */ Double, DeformTimeline],
    DrawOrderTimeline: Instantiable1[/* frameCount */ Double, DrawOrderTimeline],
    Event: Instantiable2[/* time */ Double, /* data */ EventData, Event],
    EventData: Instantiable1[/* name */ String, EventData],
    EventQueue: Instantiable1[/* animState */ AnimationState, EventQueue],
    EventTimeline: Instantiable1[/* frameCount */ Double, EventTimeline],
    FakeTexture: Instantiable0[FakeTexture],
    IkConstraint: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint],
    IkConstraintData: Instantiable1[/* name */ String, IkConstraintData],
    IkConstraintTimeline: TypeofIkConstraintTimelin,
    IntSet: Instantiable0[IntSet],
    Interpolation: Instantiable0[Interpolation],
    JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect],
    MathUtils: TypeofMathUtils,
    MeshAttachment: Instantiable1[/* name */ String, MeshAttachment],
    PathAttachment: Instantiable1[/* name */ String, PathAttachment],
    PathConstraint: TypeofPathConstraint,
    PathConstraintData: Instantiable1[/* name */ String, PathConstraintData],
    PathConstraintMixTimeline: TypeofPathConstraintMixTi,
    PathConstraintPositionTimeline: TypeofPathConstraintPosit,
    PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline],
    PointAttachment: Instantiable1[/* name */ String, PointAttachment],
    Pool: Instantiable1[
      /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
      Pool[js.Object]
    ],
    Pow: Instantiable1[/* power */ Double, Pow],
    PowOut: Instantiable1[/* power */ Double, PowOut],
    RegionAttachment: TypeofRegionAttachment,
    RotateTimeline: TypeofRotateTimeline,
    ScaleTimeline: Instantiable1[/* frameCount */ Double, ScaleTimeline],
    SharedAssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], SharedAssetManager],
    ShearTimeline: Instantiable1[/* frameCount */ Double, ShearTimeline],
    Skeleton: Instantiable1[/* data */ SkeletonData, Skeleton],
    SkeletonBinary: TypeofSkeletonBinary,
    SkeletonBounds: Instantiable0[SkeletonBounds],
    SkeletonClipping: TypeofSkeletonClipping,
    SkeletonData: Instantiable0[SkeletonData],
    SkeletonJson: TypeofSkeletonJson,
    Skin: Instantiable1[/* name */ String, Skin],
    SkinEntry: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry],
    Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot],
    SlotData: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData],
    SwirlEffect: TypeofSwirlEffect,
    Texture: TypeofTexture,
    TextureAtlas: Instantiable2[
      /* atlasText */ String, 
      /* textureLoader */ js.Function1[/* path */ String, js.Any], 
      TextureAtlas
    ],
    TextureAtlasPage: Instantiable0[TextureAtlasPage],
    TextureAtlasRegion: Instantiable0[TextureAtlasRegion],
    TextureRegion: Instantiable0[TextureRegion],
    TimeKeeper: Instantiable0[TimeKeeper],
    TrackEntry: Instantiable0[TrackEntry],
    TransformConstraint: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint],
    TransformConstraintData: Instantiable1[/* name */ String, TransformConstraintData],
    TransformConstraintTimeline: TypeofTransformConstraint,
    TranslateTimeline: TypeofTranslateTimeline,
    Triangulator: TypeofTriangulator,
    TwoColorTimeline: TypeofTwoColorTimeline,
    Utils: TypeofUtils,
    Vector2: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Vector2],
    VertexAttachment: TypeofVertexAttachment,
    WindowedMean: Instantiable1[/* windowSize */ js.UndefOr[Double], WindowedMean],
    canvas: Typeofcanvas,
    webgl: Typeofwebgl
  ): Typeofspine = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], AnimationState = AnimationState.asInstanceOf[js.Any], AnimationStateAdapter2 = AnimationStateAdapter2.asInstanceOf[js.Any], AnimationStateData = AnimationStateData.asInstanceOf[js.Any], AssetManager = AssetManager.asInstanceOf[js.Any], AtlasAttachmentLoader = AtlasAttachmentLoader.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], AttachmentTimeline = AttachmentTimeline.asInstanceOf[js.Any], Bone = Bone.asInstanceOf[js.Any], BoneData = BoneData.asInstanceOf[js.Any], BoundingBoxAttachment = BoundingBoxAttachment.asInstanceOf[js.Any], ClippingAttachment = ClippingAttachment.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorTimeline = ColorTimeline.asInstanceOf[js.Any], ConstraintData = ConstraintData.asInstanceOf[js.Any], CurveTimeline = CurveTimeline.asInstanceOf[js.Any], DebugUtils = DebugUtils.asInstanceOf[js.Any], DeformTimeline = DeformTimeline.asInstanceOf[js.Any], DrawOrderTimeline = DrawOrderTimeline.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], EventQueue = EventQueue.asInstanceOf[js.Any], EventTimeline = EventTimeline.asInstanceOf[js.Any], FakeTexture = FakeTexture.asInstanceOf[js.Any], IkConstraint = IkConstraint.asInstanceOf[js.Any], IkConstraintData = IkConstraintData.asInstanceOf[js.Any], IkConstraintTimeline = IkConstraintTimeline.asInstanceOf[js.Any], IntSet = IntSet.asInstanceOf[js.Any], Interpolation = Interpolation.asInstanceOf[js.Any], JitterEffect = JitterEffect.asInstanceOf[js.Any], MathUtils = MathUtils.asInstanceOf[js.Any], MeshAttachment = MeshAttachment.asInstanceOf[js.Any], PathAttachment = PathAttachment.asInstanceOf[js.Any], PathConstraint = PathConstraint.asInstanceOf[js.Any], PathConstraintData = PathConstraintData.asInstanceOf[js.Any], PathConstraintMixTimeline = PathConstraintMixTimeline.asInstanceOf[js.Any], PathConstraintPositionTimeline = PathConstraintPositionTimeline.asInstanceOf[js.Any], PathConstraintSpacingTimeline = PathConstraintSpacingTimeline.asInstanceOf[js.Any], PointAttachment = PointAttachment.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Pow = Pow.asInstanceOf[js.Any], PowOut = PowOut.asInstanceOf[js.Any], RegionAttachment = RegionAttachment.asInstanceOf[js.Any], RotateTimeline = RotateTimeline.asInstanceOf[js.Any], ScaleTimeline = ScaleTimeline.asInstanceOf[js.Any], SharedAssetManager = SharedAssetManager.asInstanceOf[js.Any], ShearTimeline = ShearTimeline.asInstanceOf[js.Any], Skeleton = Skeleton.asInstanceOf[js.Any], SkeletonBinary = SkeletonBinary.asInstanceOf[js.Any], SkeletonBounds = SkeletonBounds.asInstanceOf[js.Any], SkeletonClipping = SkeletonClipping.asInstanceOf[js.Any], SkeletonData = SkeletonData.asInstanceOf[js.Any], SkeletonJson = SkeletonJson.asInstanceOf[js.Any], Skin = Skin.asInstanceOf[js.Any], SkinEntry = SkinEntry.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any], SlotData = SlotData.asInstanceOf[js.Any], SwirlEffect = SwirlEffect.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any], TextureAtlas = TextureAtlas.asInstanceOf[js.Any], TextureAtlasPage = TextureAtlasPage.asInstanceOf[js.Any], TextureAtlasRegion = TextureAtlasRegion.asInstanceOf[js.Any], TextureRegion = TextureRegion.asInstanceOf[js.Any], TimeKeeper = TimeKeeper.asInstanceOf[js.Any], TrackEntry = TrackEntry.asInstanceOf[js.Any], TransformConstraint = TransformConstraint.asInstanceOf[js.Any], TransformConstraintData = TransformConstraintData.asInstanceOf[js.Any], TransformConstraintTimeline = TransformConstraintTimeline.asInstanceOf[js.Any], TranslateTimeline = TranslateTimeline.asInstanceOf[js.Any], Triangulator = Triangulator.asInstanceOf[js.Any], TwoColorTimeline = TwoColorTimeline.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], Vector2 = Vector2.asInstanceOf[js.Any], VertexAttachment = VertexAttachment.asInstanceOf[js.Any], WindowedMean = WindowedMean.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], webgl = webgl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofspine]
  }
  @scala.inline
  implicit class TypeofspineOps[Self <: Typeofspine] (val x: Self) extends AnyVal {
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
    def setAnimation(value: TypeofAnimation): Self = this.set("Animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationState(value: TypeofAnimationState): Self = this.set("AnimationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationStateAdapter2(value: Instantiable0[AnimationStateAdapter2]): Self = this.set("AnimationStateAdapter2", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationStateData(value: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData]): Self = this.set("AnimationStateData", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetManager(value: TypeofAssetManager): Self = this.set("AssetManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtlasAttachmentLoader(value: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader]): Self = this.set("AtlasAttachmentLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachment(value: Instantiable1[/* name */ String, Attachment]): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentTimeline(value: Instantiable1[/* frameCount */ Double, AttachmentTimeline]): Self = this.set("AttachmentTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setBone(value: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone]): Self = this.set("Bone", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoneData(value: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData]): Self = this.set("BoneData", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundingBoxAttachment(value: Instantiable1[/* name */ String, BoundingBoxAttachment]): Self = this.set("BoundingBoxAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setClippingAttachment(value: Instantiable1[/* name */ String, ClippingAttachment]): Self = this.set("ClippingAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: TypeofColor): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorTimeline(value: TypeofColorTimeline): Self = this.set("ColorTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintData(
      value: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData]
    ): Self = this.set("ConstraintData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurveTimeline(value: TypeofCurveTimeline): Self = this.set("CurveTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugUtils(value: TypeofDebugUtils): Self = this.set("DebugUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeformTimeline(value: Instantiable1[/* frameCount */ Double, DeformTimeline]): Self = this.set("DeformTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawOrderTimeline(value: Instantiable1[/* frameCount */ Double, DrawOrderTimeline]): Self = this.set("DrawOrderTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: Instantiable2[/* time */ Double, /* data */ EventData, Event]): Self = this.set("Event", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventData(value: Instantiable1[/* name */ String, EventData]): Self = this.set("EventData", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventQueue(value: Instantiable1[/* animState */ AnimationState, EventQueue]): Self = this.set("EventQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventTimeline(value: Instantiable1[/* frameCount */ Double, EventTimeline]): Self = this.set("EventTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setFakeTexture(value: Instantiable0[FakeTexture]): Self = this.set("FakeTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setIkConstraint(value: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint]): Self = this.set("IkConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setIkConstraintData(value: Instantiable1[/* name */ String, IkConstraintData]): Self = this.set("IkConstraintData", value.asInstanceOf[js.Any])
    @scala.inline
    def setIkConstraintTimeline(value: TypeofIkConstraintTimelin): Self = this.set("IkConstraintTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntSet(value: Instantiable0[IntSet]): Self = this.set("IntSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolation(value: Instantiable0[Interpolation]): Self = this.set("Interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def setJitterEffect(value: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect]): Self = this.set("JitterEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setMathUtils(value: TypeofMathUtils): Self = this.set("MathUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshAttachment(value: Instantiable1[/* name */ String, MeshAttachment]): Self = this.set("MeshAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathAttachment(value: Instantiable1[/* name */ String, PathAttachment]): Self = this.set("PathAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathConstraint(value: TypeofPathConstraint): Self = this.set("PathConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathConstraintData(value: Instantiable1[/* name */ String, PathConstraintData]): Self = this.set("PathConstraintData", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathConstraintMixTimeline(value: TypeofPathConstraintMixTi): Self = this.set("PathConstraintMixTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathConstraintPositionTimeline(value: TypeofPathConstraintPosit): Self = this.set("PathConstraintPositionTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathConstraintSpacingTimeline(value: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline]): Self = this.set("PathConstraintSpacingTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointAttachment(value: Instantiable1[/* name */ String, PointAttachment]): Self = this.set("PointAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setPool(
      value: Instantiable1[
          /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Pool[js.Object]
        ]
    ): Self = this.set("Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setPow(value: Instantiable1[/* power */ Double, Pow]): Self = this.set("Pow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowOut(value: Instantiable1[/* power */ Double, PowOut]): Self = this.set("PowOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionAttachment(value: TypeofRegionAttachment): Self = this.set("RegionAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateTimeline(value: TypeofRotateTimeline): Self = this.set("RotateTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleTimeline(value: Instantiable1[/* frameCount */ Double, ScaleTimeline]): Self = this.set("ScaleTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], SharedAssetManager]): Self = this.set("SharedAssetManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setShearTimeline(value: Instantiable1[/* frameCount */ Double, ShearTimeline]): Self = this.set("ShearTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkeleton(value: Instantiable1[/* data */ SkeletonData, Skeleton]): Self = this.set("Skeleton", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkeletonBinary(value: TypeofSkeletonBinary): Self = this.set("SkeletonBinary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkeletonBounds(value: Instantiable0[SkeletonBounds]): Self = this.set("SkeletonBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkeletonClipping(value: TypeofSkeletonClipping): Self = this.set("SkeletonClipping", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkeletonData(value: Instantiable0[SkeletonData]): Self = this.set("SkeletonData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkeletonJson(value: TypeofSkeletonJson): Self = this.set("SkeletonJson", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkin(value: Instantiable1[/* name */ String, Skin]): Self = this.set("Skin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkinEntry(
      value: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry]
    ): Self = this.set("SkinEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlot(value: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot]): Self = this.set("Slot", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotData(value: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData]): Self = this.set("SlotData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwirlEffect(value: TypeofSwirlEffect): Self = this.set("SwirlEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: TypeofTexture): Self = this.set("Texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureAtlas(
      value: Instantiable2[
          /* atlasText */ String, 
          /* textureLoader */ js.Function1[/* path */ String, js.Any], 
          TextureAtlas
        ]
    ): Self = this.set("TextureAtlas", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureAtlasPage(value: Instantiable0[TextureAtlasPage]): Self = this.set("TextureAtlasPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureAtlasRegion(value: Instantiable0[TextureAtlasRegion]): Self = this.set("TextureAtlasRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureRegion(value: Instantiable0[TextureRegion]): Self = this.set("TextureRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeKeeper(value: Instantiable0[TimeKeeper]): Self = this.set("TimeKeeper", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackEntry(value: Instantiable0[TrackEntry]): Self = this.set("TrackEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformConstraint(
      value: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint]
    ): Self = this.set("TransformConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformConstraintData(value: Instantiable1[/* name */ String, TransformConstraintData]): Self = this.set("TransformConstraintData", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformConstraintTimeline(value: TypeofTransformConstraint): Self = this.set("TransformConstraintTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateTimeline(value: TypeofTranslateTimeline): Self = this.set("TranslateTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangulator(value: TypeofTriangulator): Self = this.set("Triangulator", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwoColorTimeline(value: TypeofTwoColorTimeline): Self = this.set("TwoColorTimeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtils(value: TypeofUtils): Self = this.set("Utils", value.asInstanceOf[js.Any])
    @scala.inline
    def setVector2(value: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Vector2]): Self = this.set("Vector2", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexAttachment(value: TypeofVertexAttachment): Self = this.set("VertexAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowedMean(value: Instantiable1[/* windowSize */ js.UndefOr[Double], WindowedMean]): Self = this.set("WindowedMean", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvas(value: Typeofcanvas): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebgl(value: Typeofwebgl): Self = this.set("webgl", value.asInstanceOf[js.Any])
  }
  
}

