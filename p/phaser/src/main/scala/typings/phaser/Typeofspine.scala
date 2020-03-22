package typings.phaser

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

trait Typeofspine extends js.Object {
  var Animation: TypeofAnimation
  var AnimationState: TypeofAnimationState
  var AnimationStateAdapter2: Instantiable0[typings.phaser.spine.AnimationStateAdapter2]
  var AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, typings.phaser.spine.AnimationStateData]
  var AssetManager: TypeofAssetManager
  var AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, typings.phaser.spine.AtlasAttachmentLoader]
  var Attachment: Instantiable1[/* name */ String, typings.phaser.spine.Attachment]
  var AttachmentTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.AttachmentTimeline]
  var Bone: Instantiable3[
    /* data */ BoneData, 
    /* skeleton */ Skeleton, 
    /* parent */ typings.phaser.spine.Bone, 
    typings.phaser.spine.Bone
  ]
  var BoneData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* parent */ typings.phaser.spine.BoneData, 
    typings.phaser.spine.BoneData
  ]
  var BoundingBoxAttachment: Instantiable1[/* name */ String, typings.phaser.spine.BoundingBoxAttachment]
  var ClippingAttachment: Instantiable1[/* name */ String, typings.phaser.spine.ClippingAttachment]
  var Color: TypeofColor
  var ColorTimeline: TypeofColorTimeline
  var ConstraintData: Instantiable3[
    /* name */ String, 
    /* order */ Double, 
    /* skinRequired */ Boolean, 
    typings.phaser.spine.ConstraintData
  ]
  var CurveTimeline: TypeofCurveTimeline
  var DebugUtils: TypeofDebugUtils
  var DeformTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.DeformTimeline]
  var DrawOrderTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.DrawOrderTimeline]
  var Event: Instantiable2[/* time */ Double, /* data */ EventData, typings.phaser.spine.Event]
  var EventData: Instantiable1[/* name */ String, typings.phaser.spine.EventData]
  var EventQueue: Instantiable1[/* animState */ AnimationState, typings.phaser.spine.EventQueue]
  var EventTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.EventTimeline]
  var FakeTexture: Instantiable0[typings.phaser.spine.FakeTexture]
  var IkConstraint: Instantiable2[
    /* data */ IkConstraintData, 
    /* skeleton */ Skeleton, 
    typings.phaser.spine.IkConstraint
  ]
  var IkConstraintData: Instantiable1[/* name */ String, typings.phaser.spine.IkConstraintData]
  var IkConstraintTimeline: TypeofIkConstraintTimelin
  var IntSet: Instantiable0[typings.phaser.spine.IntSet]
  var Interpolation: Instantiable0[typings.phaser.spine.Interpolation]
  var JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, typings.phaser.spine.JitterEffect]
  var MathUtils: TypeofMathUtils
  var MeshAttachment: Instantiable1[/* name */ String, typings.phaser.spine.MeshAttachment]
  var PathAttachment: Instantiable1[/* name */ String, typings.phaser.spine.PathAttachment]
  var PathConstraint: TypeofPathConstraint
  var PathConstraintData: Instantiable1[/* name */ String, typings.phaser.spine.PathConstraintData]
  var PathConstraintMixTimeline: TypeofPathConstraintMixTi
  var PathConstraintPositionTimeline: TypeofPathConstraintPosit
  var PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.PathConstraintSpacingTimeline]
  var PointAttachment: Instantiable1[/* name */ String, typings.phaser.spine.PointAttachment]
  var Pool: Instantiable1[
    /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.phaser.spine.Pool[js.Object]
  ]
  var Pow: Instantiable1[/* power */ Double, typings.phaser.spine.Pow]
  var PowOut: Instantiable1[/* power */ Double, typings.phaser.spine.PowOut]
  var RegionAttachment: TypeofRegionAttachment
  var RotateTimeline: TypeofRotateTimeline
  var ScaleTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.ScaleTimeline]
  var SharedAssetManager: Instantiable1[js.UndefOr[/* pathPrefix */ String], typings.phaser.spine.SharedAssetManager]
  var ShearTimeline: Instantiable1[/* frameCount */ Double, typings.phaser.spine.ShearTimeline]
  var Skeleton: Instantiable1[/* data */ SkeletonData, typings.phaser.spine.Skeleton]
  var SkeletonBinary: TypeofSkeletonBinary
  var SkeletonBounds: Instantiable0[typings.phaser.spine.SkeletonBounds]
  var SkeletonClipping: TypeofSkeletonClipping
  var SkeletonData: Instantiable0[typings.phaser.spine.SkeletonData]
  var SkeletonJson: TypeofSkeletonJson
  var Skin: Instantiable1[/* name */ String, typings.phaser.spine.Skin]
  var SkinEntry: Instantiable3[
    /* slotIndex */ Double, 
    /* name */ String, 
    /* attachment */ Attachment, 
    typings.phaser.spine.SkinEntry
  ]
  var Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, typings.phaser.spine.Slot]
  var SlotData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* boneData */ BoneData, 
    typings.phaser.spine.SlotData
  ]
  var SwirlEffect: TypeofSwirlEffect
  var Texture: TypeofTexture
  var TextureAtlas: Instantiable2[
    /* atlasText */ String, 
    /* textureLoader */ js.Function1[/* path */ String, js.Any], 
    typings.phaser.spine.TextureAtlas
  ]
  var TextureAtlasPage: Instantiable0[typings.phaser.spine.TextureAtlasPage]
  var TextureAtlasRegion: Instantiable0[typings.phaser.spine.TextureAtlasRegion]
  var TextureRegion: Instantiable0[typings.phaser.spine.TextureRegion]
  var TimeKeeper: Instantiable0[typings.phaser.spine.TimeKeeper]
  var TrackEntry: Instantiable0[typings.phaser.spine.TrackEntry]
  var TransformConstraint: Instantiable2[
    /* data */ TransformConstraintData, 
    /* skeleton */ Skeleton, 
    typings.phaser.spine.TransformConstraint
  ]
  var TransformConstraintData: Instantiable1[/* name */ String, typings.phaser.spine.TransformConstraintData]
  var TransformConstraintTimeline: TypeofTransformConstraint
  var TranslateTimeline: TypeofTranslateTimeline
  var Triangulator: TypeofTriangulator
  var TwoColorTimeline: TypeofTwoColorTimeline
  var Utils: TypeofUtils
  var Vector2: Instantiable2[js.UndefOr[/* x */ Double], js.UndefOr[/* y */ Double], typings.phaser.spine.Vector2]
  var VertexAttachment: TypeofVertexAttachment
  var WindowedMean: Instantiable1[js.UndefOr[/* windowSize */ Double], typings.phaser.spine.WindowedMean]
  val canvas: Typeofcanvas
  val webgl: Typeofwebgl
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
    SharedAssetManager: Instantiable1[js.UndefOr[/* pathPrefix */ String], SharedAssetManager],
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
    Vector2: Instantiable2[js.UndefOr[/* x */ Double], js.UndefOr[/* y */ Double], Vector2],
    VertexAttachment: TypeofVertexAttachment,
    WindowedMean: Instantiable1[js.UndefOr[/* windowSize */ Double], WindowedMean],
    canvas: Typeofcanvas,
    webgl: Typeofwebgl
  ): Typeofspine = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], AnimationState = AnimationState.asInstanceOf[js.Any], AnimationStateAdapter2 = AnimationStateAdapter2.asInstanceOf[js.Any], AnimationStateData = AnimationStateData.asInstanceOf[js.Any], AssetManager = AssetManager.asInstanceOf[js.Any], AtlasAttachmentLoader = AtlasAttachmentLoader.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], AttachmentTimeline = AttachmentTimeline.asInstanceOf[js.Any], Bone = Bone.asInstanceOf[js.Any], BoneData = BoneData.asInstanceOf[js.Any], BoundingBoxAttachment = BoundingBoxAttachment.asInstanceOf[js.Any], ClippingAttachment = ClippingAttachment.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorTimeline = ColorTimeline.asInstanceOf[js.Any], ConstraintData = ConstraintData.asInstanceOf[js.Any], CurveTimeline = CurveTimeline.asInstanceOf[js.Any], DebugUtils = DebugUtils.asInstanceOf[js.Any], DeformTimeline = DeformTimeline.asInstanceOf[js.Any], DrawOrderTimeline = DrawOrderTimeline.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], EventQueue = EventQueue.asInstanceOf[js.Any], EventTimeline = EventTimeline.asInstanceOf[js.Any], FakeTexture = FakeTexture.asInstanceOf[js.Any], IkConstraint = IkConstraint.asInstanceOf[js.Any], IkConstraintData = IkConstraintData.asInstanceOf[js.Any], IkConstraintTimeline = IkConstraintTimeline.asInstanceOf[js.Any], IntSet = IntSet.asInstanceOf[js.Any], Interpolation = Interpolation.asInstanceOf[js.Any], JitterEffect = JitterEffect.asInstanceOf[js.Any], MathUtils = MathUtils.asInstanceOf[js.Any], MeshAttachment = MeshAttachment.asInstanceOf[js.Any], PathAttachment = PathAttachment.asInstanceOf[js.Any], PathConstraint = PathConstraint.asInstanceOf[js.Any], PathConstraintData = PathConstraintData.asInstanceOf[js.Any], PathConstraintMixTimeline = PathConstraintMixTimeline.asInstanceOf[js.Any], PathConstraintPositionTimeline = PathConstraintPositionTimeline.asInstanceOf[js.Any], PathConstraintSpacingTimeline = PathConstraintSpacingTimeline.asInstanceOf[js.Any], PointAttachment = PointAttachment.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Pow = Pow.asInstanceOf[js.Any], PowOut = PowOut.asInstanceOf[js.Any], RegionAttachment = RegionAttachment.asInstanceOf[js.Any], RotateTimeline = RotateTimeline.asInstanceOf[js.Any], ScaleTimeline = ScaleTimeline.asInstanceOf[js.Any], SharedAssetManager = SharedAssetManager.asInstanceOf[js.Any], ShearTimeline = ShearTimeline.asInstanceOf[js.Any], Skeleton = Skeleton.asInstanceOf[js.Any], SkeletonBinary = SkeletonBinary.asInstanceOf[js.Any], SkeletonBounds = SkeletonBounds.asInstanceOf[js.Any], SkeletonClipping = SkeletonClipping.asInstanceOf[js.Any], SkeletonData = SkeletonData.asInstanceOf[js.Any], SkeletonJson = SkeletonJson.asInstanceOf[js.Any], Skin = Skin.asInstanceOf[js.Any], SkinEntry = SkinEntry.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any], SlotData = SlotData.asInstanceOf[js.Any], SwirlEffect = SwirlEffect.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any], TextureAtlas = TextureAtlas.asInstanceOf[js.Any], TextureAtlasPage = TextureAtlasPage.asInstanceOf[js.Any], TextureAtlasRegion = TextureAtlasRegion.asInstanceOf[js.Any], TextureRegion = TextureRegion.asInstanceOf[js.Any], TimeKeeper = TimeKeeper.asInstanceOf[js.Any], TrackEntry = TrackEntry.asInstanceOf[js.Any], TransformConstraint = TransformConstraint.asInstanceOf[js.Any], TransformConstraintData = TransformConstraintData.asInstanceOf[js.Any], TransformConstraintTimeline = TransformConstraintTimeline.asInstanceOf[js.Any], TranslateTimeline = TranslateTimeline.asInstanceOf[js.Any], Triangulator = Triangulator.asInstanceOf[js.Any], TwoColorTimeline = TwoColorTimeline.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], Vector2 = Vector2.asInstanceOf[js.Any], VertexAttachment = VertexAttachment.asInstanceOf[js.Any], WindowedMean = WindowedMean.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], webgl = webgl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofspine]
  }
}

