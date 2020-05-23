package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pc {
  /**
    * Create an AnimationComponentSystem.
    * @param app - The application managing this system.
    */
  type AnimationComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Resource handler used for loading {@link pc.Animation} resources.
    */
  type AnimationHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Resource handler used for loading {@link pc.Sound} resources.
    * @param manager - The sound manager.
    */
  type AudioHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Create new AudioListenerComponent.
    * @param system - The ComponentSystem that created this Component.
    * @param entity - The Entity that this Component is attached to.
    */
  type AudioListenerComponent = typings.playcanvas.pc.Component
  /**
    * Create a new AudioListenerComponentSystem.
    * @param app - The application managing this system.
    * @param manager - A sound manager instance.
    */
  type AudioListenerComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new ButtonComponentSystem.
    * @param app - The application.
    */
  type ButtonComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Creates a new CollisionComponentSystem.
    * @param app - The running {pc.Application}.
    */
  type CollisionComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Component Systems contain the logic and functionality to update all Components of a particular type.
    * @param app - The application managing this system.
    */
  type ComponentSystem = typings.playcanvas.pc.EventHandler
  /**
    * Loads files that contain in them multiple resources. For example GLB files which can contain
    textures, models and animations.
    * @param device - The graphics device that will be rendering.
    * @param defaultMaterial - The shared default material that is used in any place that a material is not specified.
    */
  type ContainerHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Resource handler used for loading cubemap {@link pc.Texture} resources.
    * @param device - The graphics device.
    * @param assets - The asset registry.
    * @param loader - The resource loader.
    */
  type CubemapHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Manages creation of {@link pc.ElementComponent}s.
    * @param app - The application.
    */
  type ElementComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new ElementDragHelper.
    * @param element - The Element that should become draggable.
    * @param [axis] - Optional axis to constrain to, either 'x', 'y' or null.
    */
  type ElementDragHelper = typings.playcanvas.pc.EventHandler
  /**
    * Resource handler used for loading {@link pc.Font} resources.
    * @param loader - The resource loader.
    */
  type FontHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Create a new LayoutChildComponentSystem.
    * @param app - The application.
    */
  type LayoutChildComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new LayoutGroupComponentSystem.
    * @param app - The application.
    */
  type LayoutGroupComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new LightComponentSystem.
    * @param app - The application.
    */
  type LightComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Resource handler used for loading {@link pc.Material} resources.
    * @param app - The running {@link pc.Application}.
    */
  type MaterialHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Create a new ModelComponentSystem.
    * @param app - The Application.
    */
  type ModelComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new ParticleSystemComponentSystem.
    * @param app - The Application.
    */
  type ParticleSystemComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Resource handler used for loading {@link pc.Scene} resources.
    * @param app - The running {@link pc.Application}.
    */
  type SceneHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Create a new ScreenComponentSystem.
    * @param app - The application.
    */
  type ScreenComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new ScriptComponentSystem.
    * @param app - The application.
    */
  type ScriptComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Resource handler for loading JavaScript files dynamically
    Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
    or regular JavaScript files, such as third-party libraries.
    * @param app - The running {@link pc.Application}.
    */
  type ScriptHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Create a new ScrollViewComponentSystem.
    * @param app - The application.
    */
  type ScrollViewComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Create a new ScrollbarComponentSystem.
    * @param app - The application.
    */
  type ScrollbarComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Manages creation of {@link pc.SpriteComponent}s.
    * @param app - The application.
    */
  type SpriteComponentSystem = typings.playcanvas.pc.ComponentSystem
  /**
    * Resource handler used for loading {@link pc.Sprite} resources.
    * @param assets - The asset registry.
    * @param device - The graphics device.
    */
  type SpriteHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Resource handler used for loading {@link pc.TextureAtlas} resources.
    * @param loader - The resource loader.
    */
  type TextureAtlasHandler = typings.playcanvas.pc.ResourceHandler
  /**
    * Resource handler used for loading 2D and 3D {@link pc.Texture} resources.
    * @param device - The graphics device.
    * @param assets - The asset registry.
    * @param loader - The resource loader.
    */
  type TextureHandler = typings.playcanvas.pc.ResourceHandler
}
