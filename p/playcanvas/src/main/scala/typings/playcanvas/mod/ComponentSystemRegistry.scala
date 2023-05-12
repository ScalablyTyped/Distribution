package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * @type {import('./anim/system.js').AnimComponentSystem|undefined}
    * @readonly
    */
  val anim: js.UndefOr[AnimComponentSystem] = js.native
  
  /**
    * Gets the {@link AnimationComponentSystem} from the registry.
    *
    * @type {import('./animation/system.js').AnimationComponentSystem|undefined}
    * @readonly
    */
  val animation: js.UndefOr[AnimationComponentSystem] = js.native
  
  /**
    * Gets the {@link AudioListenerComponentSystem} from the registry.
    *
    * @type {import('./audio-listener/system.js').AudioListenerComponentSystem|undefined}
    * @readonly
    */
  val audiolistener: js.UndefOr[AudioListenerComponentSystem] = js.native
  
  /**
    * Gets the {@link AudioSourceComponentSystem} from the registry.
    *
    * @type {import('./audio-source/system.js').AudioSourceComponentSystem|undefined}
    * @readonly
    * @ignore
    */
  val audiosource: js.UndefOr[AudioSourceComponentSystem] = js.native
  
  /**
    * Gets the {@link ButtonComponentSystem} from the registry.
    *
    * @type {import('./button/system.js').ButtonComponentSystem|undefined}
    * @readonly
    */
  val button: js.UndefOr[ButtonComponentSystem] = js.native
  
  /**
    * Gets the {@link CameraComponentSystem} from the registry.
    *
    * @type {import('./camera/system.js').CameraComponentSystem|undefined}
    * @readonly
    */
  val camera: js.UndefOr[CameraComponentSystem] = js.native
  
  /**
    * Gets the {@link CollisionComponentSystem} from the registry.
    *
    * @type {import('./collision/system.js').CollisionComponentSystem|undefined}
    * @readonly
    */
  val collision: js.UndefOr[CollisionComponentSystem] = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Gets the {@link ElementComponentSystem} from the registry.
    *
    * @type {import('./element/system.js').ElementComponentSystem|undefined}
    * @readonly
    */
  val element: js.UndefOr[ElementComponentSystem] = js.native
  
  /**
    * Gets the {@link JointComponentSystem} from the registry.
    *
    * @type {import('./joint/system.js').JointComponentSystem|undefined}
    * @readonly
    * @ignore
    */
  val joint: js.UndefOr[JointComponentSystem] = js.native
  
  /**
    * Gets the {@link LayoutChildComponentSystem} from the registry.
    *
    * @type {import('./layout-child/system.js').LayoutChildComponentSystem|undefined}
    * @readonly
    */
  val layoutchild: js.UndefOr[LayoutChildComponentSystem] = js.native
  
  /**
    * Gets the {@link LayoutGroupComponentSystem} from the registry.
    *
    * @type {import('./layout-group/system.js').LayoutGroupComponentSystem|undefined}
    * @readonly
    */
  val layoutgroup: js.UndefOr[LayoutGroupComponentSystem] = js.native
  
  /**
    * Gets the {@link LightComponentSystem} from the registry.
    *
    * @type {import('./light/system.js').LightComponentSystem|undefined}
    * @readonly
    */
  val light: js.UndefOr[LightComponentSystem] = js.native
  
  var list: js.Array[Any] = js.native
  
  /**
    * Gets the {@link ModelComponentSystem} from the registry.
    *
    * @type {import('./model/system.js').ModelComponentSystem|undefined}
    * @readonly
    */
  val model: js.UndefOr[ModelComponentSystem] = js.native
  
  /**
    * Gets the {@link ParticleSystemComponentSystem} from the registry.
    *
    * @type {import('./particle-system/system.js').ParticleSystemComponentSystem|undefined}
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
    * @type {import('./render/system.js').RenderComponentSystem|undefined}
    * @readonly
    */
  val render: js.UndefOr[RenderComponentSystem] = js.native
  
  /**
    * Gets the {@link RigidBodyComponentSystem} from the registry.
    *
    * @type {import('./rigid-body/system.js').RigidBodyComponentSystem|undefined}
    * @readonly
    */
  val rigidbody: js.UndefOr[RigidBodyComponentSystem] = js.native
  
  /**
    * Gets the {@link ScreenComponentSystem} from the registry.
    *
    * @type {import('./screen/system.js').ScreenComponentSystem|undefined}
    * @readonly
    */
  val screen: js.UndefOr[ScreenComponentSystem] = js.native
  
  /**
    * Gets the {@link ScriptComponentSystem} from the registry.
    *
    * @type {import('./script/system.js').ScriptComponentSystem|undefined}
    * @readonly
    */
  val script: js.UndefOr[ScriptComponentSystem] = js.native
  
  /**
    * Gets the {@link ScrollbarComponentSystem} from the registry.
    *
    * @type {import('./scrollbar/system.js').ScrollbarComponentSystem|undefined}
    * @readonly
    */
  val scrollbar: js.UndefOr[ScrollbarComponentSystem] = js.native
  
  /**
    * Gets the {@link ScrollViewComponentSystem} from the registry.
    *
    * @type {import('./scroll-view/system.js').ScrollViewComponentSystem|undefined}
    * @readonly
    */
  val scrollview: js.UndefOr[ScrollViewComponentSystem] = js.native
  
  /**
    * Gets the {@link SoundComponentSystem} from the registry.
    *
    * @type {import('./sound/system.js').SoundComponentSystem|undefined}
    * @readonly
    */
  val sound: js.UndefOr[SoundComponentSystem] = js.native
  
  /**
    * Gets the {@link SpriteComponentSystem} from the registry.
    *
    * @type {import('./sprite/system.js').SpriteComponentSystem|undefined}
    * @readonly
    */
  val sprite: js.UndefOr[SpriteComponentSystem] = js.native
  
  /**
    * Gets the {@link ZoneComponentSystem} from the registry.
    *
    * @type {import('./zone/system.js').ZoneComponentSystem|undefined}
    * @readonly
    * @ignore
    */
  val zone: js.UndefOr[ZoneComponentSystem] = js.native
}
