package typings.popmotionPose.libTypesMod

import typings.popmotionPose.anon.ElementStyler
import typings.poseCore.libTypesMod.ExtendAPI
import typings.poseCore.libTypesMod.Poser
import typings.poseCore.libTypesMod.PoserConfig
import typings.poseCore.libTypesMod.Props
import typings.poseCore.libTypesMod.ReadValueFromSource
import typings.poseCore.libTypesMod.TransformPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopmotionPoserFactoryConfig[P, TD] extends StObject {
  
  def addListenerToValue(
    key: String,
    styler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any
  ): js.Function1[/* v */ Any, Unit]
  
  def extendAPI(
    api: Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ],
    state: typings.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ],
    config: PoserConfig[Value]
  ): Poser[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
    P
  ]
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
    P
  ]
  
  def forceRender(props: ElementStyler): Unit
  
  var posePriority: js.UndefOr[js.Array[String]] = js.undefined
  
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.undefined
  
  def setValueNative(key: String, to: Any, props: ElementStyler): Unit
  
  def transformPose(
    pose: typings.poseCore.libTypesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TD
    ],
    key: String,
    state: typings.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ]
  ): typings.poseCore.libTypesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    TD
  ]
  @JSName("transformPose")
  var transformPose_Original: TransformPose[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
    P, 
    TD
  ]
}
object PopmotionPoserFactoryConfig {
  
  inline def apply[P, TD](
    addListenerToValue: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any) => js.Function1[/* v */ Any, Unit],
    extendAPI: (/* api */ Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ], /* state */ typings.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ], /* config */ PoserConfig[Value]) => Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ],
    forceRender: ElementStyler => Unit,
    setValueNative: (String, Any, ElementStyler) => Unit,
    transformPose: (/* pose */ typings.poseCore.libTypesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TD
    ], /* key */ String, /* state */ typings.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ]) => typings.poseCore.libTypesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TD
    ]
  ): PopmotionPoserFactoryConfig[P, TD] = {
    val __obj = js.Dynamic.literal(addListenerToValue = js.Any.fromFunction2(addListenerToValue), extendAPI = js.Any.fromFunction3(extendAPI), forceRender = js.Any.fromFunction1(forceRender), setValueNative = js.Any.fromFunction3(setValueNative), transformPose = js.Any.fromFunction3(transformPose))
    __obj.asInstanceOf[PopmotionPoserFactoryConfig[P, TD]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopmotionPoserFactoryConfig[?, ?], P, TD] (val x: Self & (PopmotionPoserFactoryConfig[P, TD])) extends AnyVal {
    
    inline def setAddListenerToValue(
      value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any) => js.Function1[/* v */ Any, Unit]
    ): Self = StObject.set(x, "addListenerToValue", js.Any.fromFunction2(value))
    
    inline def setExtendAPI(
      value: (/* api */ Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ], /* state */ typings.poseCore.libTypesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ], /* config */ PoserConfig[Value]) => Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ]
    ): Self = StObject.set(x, "extendAPI", js.Any.fromFunction3(value))
    
    inline def setForceRender(value: ElementStyler => Unit): Self = StObject.set(x, "forceRender", js.Any.fromFunction1(value))
    
    inline def setPosePriority(value: js.Array[String]): Self = StObject.set(x, "posePriority", value.asInstanceOf[js.Any])
    
    inline def setPosePriorityUndefined: Self = StObject.set(x, "posePriority", js.undefined)
    
    inline def setPosePriorityVarargs(value: String*): Self = StObject.set(x, "posePriority", js.Array(value*))
    
    inline def setReadValueFromSource(value: (/* key */ String, /* props */ Props) => Any): Self = StObject.set(x, "readValueFromSource", js.Any.fromFunction2(value))
    
    inline def setReadValueFromSourceUndefined: Self = StObject.set(x, "readValueFromSource", js.undefined)
    
    inline def setSetValueNative(value: (String, Any, ElementStyler) => Unit): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3(value))
    
    inline def setTransformPose(
      value: (/* pose */ typings.poseCore.libTypesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          TD
        ], /* key */ String, /* state */ typings.poseCore.libTypesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ]) => typings.poseCore.libTypesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          TD
        ]
    ): Self = StObject.set(x, "transformPose", js.Any.fromFunction3(value))
  }
}
