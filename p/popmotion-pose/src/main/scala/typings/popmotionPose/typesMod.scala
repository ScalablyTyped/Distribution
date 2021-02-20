package typings.popmotionPose

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.popmotionPose.anon.Ease
import typings.popmotionPose.anon.ElementStyler
import typings.popmotionPose.anon.Type
import typings.popmotionPose.anon.`0`
import typings.popmotionPose.anon.`1`
import typings.popmotionPose.anon.`2`
import typings.popmotionPose.anon.`3`
import typings.popmotionPose.popmotionPoseBooleans.`false`
import typings.poseCore.typesMod.ExtendAPI
import typings.poseCore.typesMod.Poser
import typings.poseCore.typesMod.PoserConfig
import typings.poseCore.typesMod.ReadValueFromSource
import typings.poseCore.typesMod.TransformPose
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.styleValueTypes.typesMod.ValueType
import typings.stylefire.typesMod.Styler
import typings.tsEssentials.typesMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait BoundingBoxDimension extends StObject
  @JSImport("popmotion-pose/lib/types", "BoundingBoxDimension")
  @js.native
  object BoundingBoxDimension extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BoundingBoxDimension with String] = js.native
    
    @js.native
    sealed trait bottom extends BoundingBoxDimension
    /* "bottom" */ val bottom: typings.popmotionPose.typesMod.BoundingBoxDimension.bottom with String = js.native
    
    @js.native
    sealed trait height extends BoundingBoxDimension
    /* "height" */ val height: typings.popmotionPose.typesMod.BoundingBoxDimension.height with String = js.native
    
    @js.native
    sealed trait left extends BoundingBoxDimension
    /* "left" */ val left: typings.popmotionPose.typesMod.BoundingBoxDimension.left with String = js.native
    
    @js.native
    sealed trait right extends BoundingBoxDimension
    /* "right" */ val right: typings.popmotionPose.typesMod.BoundingBoxDimension.right with String = js.native
    
    @js.native
    sealed trait top extends BoundingBoxDimension
    /* "top" */ val top: typings.popmotionPose.typesMod.BoundingBoxDimension.top with String = js.native
    
    @js.native
    sealed trait width extends BoundingBoxDimension
    /* "width" */ val width: typings.popmotionPose.typesMod.BoundingBoxDimension.width with String = js.native
  }
  
  type AnimationDef = TransitionDefinition
  
  type BoundingBox = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]: number}
    */ typings.popmotionPose.popmotionPoseStrings.BoundingBox with TopLevel[js.Any]
  
  type CubicBezierArgs = js.Tuple4[Double, Double, Double, Double]
  
  type DecayDefinition = Type with TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecayProps */ js.Any) with NoEase
  
  @js.native
  trait Dimensions extends StObject {
    
    def get(): BoundingBox | Double = js.native
    def get(measurement: BoundingBoxDimension): BoundingBox | Double = js.native
    
    def has(): Boolean = js.native
    
    def measure(): BoundingBox = js.native
    
    def measurementAsPixels(measurement: BoundingBoxDimension, value: String): Double = js.native
    def measurementAsPixels(measurement: BoundingBoxDimension, value: String, `type`: ValueType): Double = js.native
    def measurementAsPixels(measurement: BoundingBoxDimension, value: Double): Double = js.native
    def measurementAsPixels(measurement: BoundingBoxDimension, value: Double, `type`: ValueType): Double = js.native
  }
  
  @js.native
  trait DomPopmotionConfig
    extends /* key */ StringDictionary[js.Any] {
    
    var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.native
    
    var draggable: js.UndefOr[Draggable] = js.native
    
    var hoverable: js.UndefOr[Boolean] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
    
    var onPressEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
    
    var onPressStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.native
    
    var props: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object DomPopmotionConfig {
    
    @scala.inline
    def apply(): DomPopmotionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomPopmotionConfig]
    }
    
    @scala.inline
    implicit class DomPopmotionConfigMutableBuilder[Self <: DomPopmotionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragBounds(value: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])): Self = StObject.set(x, "dragBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragBoundsFunction1(value: /* props */ ResolverProps => DragBounds): Self = StObject.set(x, "dragBounds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragBoundsUndefined: Self = StObject.set(x, "dragBounds", js.undefined)
      
      @scala.inline
      def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* e */ MouseEvent | TouchEvent => _): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* e */ MouseEvent | TouchEvent => _): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnPressEnd(value: /* e */ MouseEvent | TouchEvent => _): Self = StObject.set(x, "onPressEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEndUndefined: Self = StObject.set(x, "onPressEnd", js.undefined)
      
      @scala.inline
      def setOnPressStart(value: /* e */ MouseEvent | TouchEvent => _): Self = StObject.set(x, "onPressStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressStartUndefined: Self = StObject.set(x, "onPressStart", js.undefined)
      
      @scala.inline
      def setProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  @js.native
  trait DomPopmotionPoser
    extends Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
          DomPopmotionPoser
        ] {
    
    def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
    
    def flip(op: js.Function): js.Promise[_] = js.native
    
    def measure(): BoundingBox = js.native
  }
  
  type DragBounds = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in popmotion-pose.popmotion-pose/lib/types.BoundingBoxDimension ]:? number | string}
    */ typings.popmotionPose.popmotionPoseStrings.DragBounds with TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.popmotionPose.popmotionPoseStrings.x
    - typings.popmotionPose.popmotionPoseStrings.y
  */
  type Draggable = _Draggable | Boolean
  
  type KeyframesDefinition = `0` with TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyframesProps */ js.Any)
  
  @js.native
  trait NoEase extends StObject {
    
    var ease: js.UndefOr[scala.Nothing] = js.native
  }
  
  type PhysicsDefinition = `1` with TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhysicsProps */ js.Any) with NoEase
  
  @js.native
  trait PopmotionPoserFactoryConfig[P, TD] extends StObject {
    
    def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
    
    def extendAPI(
      api: Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
          P
        ],
      state: typings.poseCore.typesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
          P
        ],
      config: PoserConfig[Value]
    ): Poser[
        Value, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
        P
      ] = js.native
    @JSName("extendAPI")
    var extendAPI_Original: ExtendAPI[
        Value, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
        P
      ] = js.native
    
    def forceRender(props: ElementStyler): Unit = js.native
    
    var posePriority: js.UndefOr[js.Array[String]] = js.native
    
    var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
    
    def setValueNative(key: String, to: js.Any, props: ElementStyler): Unit = js.native
    
    def transformPose(
      pose: typings.poseCore.typesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
          TD
        ],
      key: String,
      state: typings.poseCore.typesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
          P
        ]
    ): typings.poseCore.typesMod.Pose[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
        TD
      ] = js.native
    @JSName("transformPose")
    var transformPose_Original: TransformPose[
        Value, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
        P, 
        TD
      ] = js.native
  }
  
  type Pose = typings.poseCore.typesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    TransitionDefinition
  ]
  
  type PoseMap = typings.poseCore.typesMod.PoseMap[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    TransitionDefinition
  ]
  
  type PoserState = typings.poseCore.typesMod.PoserState[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
    DomPopmotionPoser
  ]
  
  /* Inlined popmotion-pose.popmotion-pose/lib/types.TransitionProps & {[key: string] : any} */
  @js.native
  trait ResolverProps
    extends /* key */ StringDictionary[js.Any] {
    
    var dimensions: Dimensions = js.native
    
    var from: String | Double = js.native
    
    var key: String = js.native
    
    var prevPoseKey: String = js.native
    
    var to: String | Double = js.native
    
    var velocity: Double = js.native
  }
  object ResolverProps {
    
    @scala.inline
    def apply(
      dimensions: Dimensions,
      from: String | Double,
      key: String,
      prevPoseKey: String,
      to: String | Double,
      velocity: Double
    ): ResolverProps = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prevPoseKey = prevPoseKey.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverProps]
    }
    
    @scala.inline
    implicit class ResolverPropsMutableBuilder[Self <: ResolverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPoseKey(value: String): Self = StObject.set(x, "prevPoseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  type SpringDefinition = `2` with TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringProps */ js.Any) with NoEase
  
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  
  type Transition = js.Function1[
    /* props */ ResolverProps, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any) | `false`
  ]
  
  type TransitionDefinition = TweenDefinition | PhysicsDefinition | SpringDefinition | DecayDefinition | KeyframesDefinition
  
  @js.native
  trait TransitionDefinitionCommonProps extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var round: js.UndefOr[Boolean] = js.native
  }
  object TransitionDefinitionCommonProps {
    
    @scala.inline
    def apply(): TransitionDefinitionCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionDefinitionCommonProps]
    }
    
    @scala.inline
    implicit class TransitionDefinitionCommonPropsMutableBuilder[Self <: TransitionDefinitionCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
  
  @js.native
  trait TransitionProps extends StObject {
    
    var dimensions: Dimensions = js.native
    
    var from: String | Double = js.native
    
    var key: String = js.native
    
    var prevPoseKey: String = js.native
    
    var to: String | Double = js.native
    
    var velocity: Double = js.native
  }
  object TransitionProps {
    
    @scala.inline
    def apply(
      dimensions: Dimensions,
      from: String | Double,
      key: String,
      prevPoseKey: String,
      to: String | Double,
      velocity: Double
    ): TransitionProps = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prevPoseKey = prevPoseKey.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProps]
    }
    
    @scala.inline
    implicit class TransitionPropsMutableBuilder[Self <: TransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPoseKey(value: String): Self = StObject.set(x, "prevPoseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  type TweenDefinition = Merge[
    `3` with TransitionDefinitionCommonProps with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps */ js.Any), 
    Ease
  ]
  
  @js.native
  trait Value extends StObject {
    
    var raw: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueReaction */ js.Any = js.native
    
    var `type`: js.UndefOr[ValueType] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(
      raw: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueReaction */ js.Any
    ): Value = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueReaction */ js.Any
      ): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait _Draggable extends StObject
}
