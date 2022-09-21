package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./anim/system.js').AnimComponentSystem} AnimComponentSystem */
/** @typedef {import('./animation/system.js').AnimationComponentSystem} AnimationComponentSystem */
/** @typedef {import('./audio-listener/system.js').AudioListenerComponentSystem} AudioListenerComponentSystem */
/** @typedef {import('./audio-source/system.js').AudioSourceComponentSystem} AudioSourceComponentSystem */
/** @typedef {import('./button/system.js').ButtonComponentSystem} ButtonComponentSystem */
/** @typedef {import('./camera/system.js').CameraComponentSystem} CameraComponentSystem */
/** @typedef {import('./collision/system.js').CollisionComponentSystem} CollisionComponentSystem */
/** @typedef {import('./element/system.js').ElementComponentSystem} ElementComponentSystem */
/** @typedef {import('./joint/system.js').JointComponentSystem} JointComponentSystem */
/** @typedef {import('./layout-child/system.js').LayoutChildComponentSystem} LayoutChildComponentSystem */
/** @typedef {import('./layout-group/system.js').LayoutGroupComponentSystem} LayoutGroupComponentSystem */
/** @typedef {import('./light/system.js').LightComponentSystem} LightComponentSystem */
/** @typedef {import('./model/system.js').ModelComponentSystem} ModelComponentSystem */
/** @typedef {import('./particle-system/system.js').ParticleSystemComponentSystem} ParticleSystemComponentSystem */
/** @typedef {import('./render/system.js').RenderComponentSystem} RenderComponentSystem */
/** @typedef {import('./rigid-body/system.js').RigidBodyComponentSystem} RigidBodyComponentSystem */
/** @typedef {import('./screen/system.js').ScreenComponentSystem} ScreenComponentSystem */
/** @typedef {import('./script/system.js').ScriptComponentSystem} ScriptComponentSystem */
/** @typedef {import('./scrollbar/system.js').ScrollbarComponentSystem} ScrollbarComponentSystem */
/** @typedef {import('./scroll-view/system.js').ScrollViewComponentSystem} ScrollViewComponentSystem */
/** @typedef {import('./sound/system.js').SoundComponentSystem} SoundComponentSystem */
/** @typedef {import('./sprite/system.js').SpriteComponentSystem} SpriteComponentSystem */
/** @typedef {import('./zone/system.js').ZoneComponentSystem} ZoneComponentSystem */
/**
  * Store, access and delete instances of the various ComponentSystems.
  */
@JSImport("playcanvas", "ComponentSystemRegistry")
@js.native
open class ComponentSystemRegistry () extends EventHandler {
  
  /**
    * Add a component system to the registry.
    *
    * @param {object} system - The {@link ComponentSystem} instance.
    * @ignore
    */
  def add(system: js.Object): Unit = js.native
  
  /**
    * Gets the {@link AnimComponentSystem} from the registry.
    *
    * @type {AnimComponentSystem|undefined}
    * @readonly
    */
  val anim: js.UndefOr[AnimComponentSystem] = js.native
  
  /**
    * Gets the {@link AnimationComponentSystem} from the registry.
    *
    * @type {AnimationComponentSystem|undefined}
    * @readonly
    */
  val animation: js.UndefOr[AnimationComponentSystem] = js.native
  
  /**
    * Gets the {@link AudioListenerComponentSystem} from the registry.
    *
    * @type {AudioListenerComponentSystem|undefined}
    * @readonly
    */
  val audiolistener: js.UndefOr[AudioListenerComponentSystem] = js.native
  
  /**
    * Gets the {@link AudioSourceComponentSystem} from the registry.
    *
    * @type {AudioSourceComponentSystem|undefined}
    * @readonly
    * @ignore
    */
  val audiosource: js.UndefOr[AudioSourceComponentSystem] = js.native
  
  /**
    * Gets the {@link ButtonComponentSystem} from the registry.
    *
    * @type {ButtonComponentSystem|undefined}
    * @readonly
    */
  val button: js.UndefOr[ButtonComponentSystem] = js.native
  
  /**
    * Gets the {@link CameraComponentSystem} from the registry.
    *
    * @type {CameraComponentSystem|undefined}
    * @readonly
    */
  val camera: js.UndefOr[CameraComponentSystem] = js.native
  
  /**
    * Gets the {@link CollisionComponentSystem} from the registry.
    *
    * @type {CollisionComponentSystem|undefined}
    * @readonly
    */
  val collision: js.UndefOr[CollisionComponentSystem] = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Gets the {@link ElementComponentSystem} from the registry.
    *
    * @type {ElementComponentSystem|undefined}
    * @readonly
    */
  val element: js.UndefOr[ElementComponentSystem] = js.native
  
  /**
    * Gets the {@link JointComponentSystem} from the registry.
    *
    * @type {JointComponentSystem|undefined}
    * @readonly
    * @ignore
    */
  val joint: js.UndefOr[JointComponentSystem] = js.native
  
  /**
    * Gets the {@link LayoutChildComponentSystem} from the registry.
    *
    * @type {LayoutChildComponentSystem|undefined}
    * @readonly
    */
  val layoutchild: js.UndefOr[LayoutChildComponentSystem] = js.native
  
  /**
    * Gets the {@link LayoutGroupComponentSystem} from the registry.
    *
    * @type {LayoutGroupComponentSystem|undefined}
    * @readonly
    */
  val layoutgroup: js.UndefOr[LayoutGroupComponentSystem] = js.native
  
  /**
    * Gets the {@link LightComponentSystem} from the registry.
    *
    * @type {LightComponentSystem|undefined}
    * @readonly
    */
  val light: js.UndefOr[LightComponentSystem] = js.native
  
  var list: js.Array[Any] = js.native
  
  /**
    * Gets the {@link ModelComponentSystem} from the registry.
    *
    * @type {ModelComponentSystem|undefined}
    * @readonly
    */
  val model: js.UndefOr[ModelComponentSystem] = js.native
  
  /**
    * Gets the {@link ParticleSystemComponentSystem} from the registry.
    *
    * @type {ParticleSystemComponentSystem|undefined}
    * @readonly
    */
  val particlesystem: js.UndefOr[ParticleSystemComponentSystem] = js.native
  
  /**
    * Remove a component system from the registry.
    *
    * @param {object} system - The {@link ComponentSystem} instance.
    * @ignore
    */
  def remove(system: js.Object): Unit = js.native
  
  /**
    * Gets the {@link RenderComponentSystem} from the registry.
    *
    * @type {RenderComponentSystem|undefined}
    * @readonly
    */
  val render: js.UndefOr[RenderComponentSystem] = js.native
  
  /**
    * Gets the {@link RigidBodyComponentSystem} from the registry.
    *
    * @type {RigidBodyComponentSystem|undefined}
    * @readonly
    */
  val rigidbody: js.UndefOr[RigidBodyComponentSystem] = js.native
  
  /**
    * Gets the {@link ScreenComponentSystem} from the registry.
    *
    * @type {ScreenComponentSystem|undefined}
    * @readonly
    */
  val screen: js.UndefOr[ScreenComponentSystem] = js.native
  
  /**
    * Gets the {@link ScriptComponentSystem} from the registry.
    *
    * @type {ScriptComponentSystem|undefined}
    * @readonly
    */
  val script: js.UndefOr[ScriptComponentSystem] = js.native
  
  /**
    * Gets the {@link ScrollbarComponentSystem} from the registry.
    *
    * @type {ScrollbarComponentSystem|undefined}
    * @readonly
    */
  val scrollbar: js.UndefOr[ScrollbarComponentSystem] = js.native
  
  /**
    * Gets the {@link ScrollViewComponentSystem} from the registry.
    *
    * @type {ScrollViewComponentSystem|undefined}
    * @readonly
    */
  val scrollview: js.UndefOr[ScrollViewComponentSystem] = js.native
  
  /**
    * Gets the {@link SoundComponentSystem} from the registry.
    *
    * @type {SoundComponentSystem|undefined}
    * @readonly
    */
  val sound: js.UndefOr[SoundComponentSystem] = js.native
  
  /**
    * Gets the {@link SpriteComponentSystem} from the registry.
    *
    * @type {SpriteComponentSystem|undefined}
    * @readonly
    */
  val sprite: js.UndefOr[SpriteComponentSystem] = js.native
  
  /**
    * Gets the {@link ZoneComponentSystem} from the registry.
    *
    * @type {ZoneComponentSystem|undefined}
    * @readonly
    * @ignore
    */
  val zone: js.UndefOr[ZoneComponentSystem] = js.native
}
