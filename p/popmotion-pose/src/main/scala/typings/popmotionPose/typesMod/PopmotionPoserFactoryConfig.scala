package typings.popmotionPose.typesMod

import typings.popmotionPose.anon.ElementStyler
import typings.poseCore.typesMod.ExtendAPI
import typings.poseCore.typesMod.Poser
import typings.poseCore.typesMod.PoserConfig
import typings.poseCore.typesMod.Props
import typings.poseCore.typesMod.ReadValueFromSource
import typings.poseCore.typesMod.TransformPose
import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopmotionPoserFactoryConfig[P, TD] extends StObject {
  
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit]
  
  def extendAPI(
    api: Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ],
    state: typings.poseCore.typesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ],
    config: PoserConfig[Value]
  ): Poser[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
    P
  ]
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
    P
  ]
  
  def forceRender(props: ElementStyler): Unit
  
  var posePriority: js.UndefOr[js.Array[String]] = js.undefined
  
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.undefined
  
  def setValueNative(key: String, to: js.Any, props: ElementStyler): Unit
  
  def transformPose(
    pose: typings.poseCore.typesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TD
    ],
    key: String,
    state: typings.poseCore.typesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ]
  ): typings.poseCore.typesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    TD
  ]
  @JSName("transformPose")
  var transformPose_Original: TransformPose[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
    P, 
    TD
  ]
}
object PopmotionPoserFactoryConfig {
  
  inline def apply[P, TD](
    addListenerToValue: (String, Styler) => js.Function1[/* v */ js.Any, Unit],
    extendAPI: (/* api */ Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ], /* state */ typings.poseCore.typesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ], /* config */ PoserConfig[Value]) => Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ],
    forceRender: ElementStyler => Unit,
    setValueNative: (String, js.Any, ElementStyler) => Unit,
    transformPose: (/* pose */ typings.poseCore.typesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TD
    ], /* key */ String, /* state */ typings.poseCore.typesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      P
    ]) => typings.poseCore.typesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TD
    ]
  ): PopmotionPoserFactoryConfig[P, TD] = {
    val __obj = js.Dynamic.literal(addListenerToValue = js.Any.fromFunction2(addListenerToValue), extendAPI = js.Any.fromFunction3(extendAPI), forceRender = js.Any.fromFunction1(forceRender), setValueNative = js.Any.fromFunction3(setValueNative), transformPose = js.Any.fromFunction3(transformPose))
    __obj.asInstanceOf[PopmotionPoserFactoryConfig[P, TD]]
  }
  
  extension [Self <: PopmotionPoserFactoryConfig[?, ?], P, TD](x: Self & (PopmotionPoserFactoryConfig[P, TD])) {
    
    inline def setAddListenerToValue(value: (String, Styler) => js.Function1[/* v */ js.Any, Unit]): Self = StObject.set(x, "addListenerToValue", js.Any.fromFunction2(value))
    
    inline def setExtendAPI(
      value: (/* api */ Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
          P
        ], /* state */ typings.poseCore.typesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
          P
        ], /* config */ PoserConfig[Value]) => Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
          P
        ]
    ): Self = StObject.set(x, "extendAPI", js.Any.fromFunction3(value))
    
    inline def setForceRender(value: ElementStyler => Unit): Self = StObject.set(x, "forceRender", js.Any.fromFunction1(value))
    
    inline def setPosePriority(value: js.Array[String]): Self = StObject.set(x, "posePriority", value.asInstanceOf[js.Any])
    
    inline def setPosePriorityUndefined: Self = StObject.set(x, "posePriority", js.undefined)
    
    inline def setPosePriorityVarargs(value: String*): Self = StObject.set(x, "posePriority", js.Array(value :_*))
    
    inline def setReadValueFromSource(value: (/* key */ String, /* props */ Props) => js.Any): Self = StObject.set(x, "readValueFromSource", js.Any.fromFunction2(value))
    
    inline def setReadValueFromSourceUndefined: Self = StObject.set(x, "readValueFromSource", js.undefined)
    
    inline def setSetValueNative(value: (String, js.Any, ElementStyler) => Unit): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3(value))
    
    inline def setTransformPose(
      value: (/* pose */ typings.poseCore.typesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          TD
        ], /* key */ String, /* state */ typings.poseCore.typesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
          P
        ]) => typings.poseCore.typesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
          TD
        ]
    ): Self = StObject.set(x, "transformPose", js.Any.fromFunction3(value))
  }
}
