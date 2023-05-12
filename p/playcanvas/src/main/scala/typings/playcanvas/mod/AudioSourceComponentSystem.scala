package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls playback of an audio sample. This class will be deprecated in favor of
  * {@link SoundComponentSystem}.
  *
  * @augments ComponentSystem
  * @ignore
  */
@JSImport("playcanvas", "AudioSourceComponentSystem")
@js.native
open class AudioSourceComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ AudioSourceComponentSystem, /* entity */ Entity, AudioSourceComponent] = js.native
  
  var DataType: Instantiable0[AudioSourceComponentData] = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  var initialized: Boolean = js.native
  
  var manager: SoundManager = js.native
  
  def onInitialize(root: Any): Unit = js.native
  
  def onRemove(entity: Any, data: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  @JSName("schema")
  var schema_AudioSourceComponentSystem: js.Array[String] = js.native
  
  /**
    * Set the volume for the entire AudioSource system. All sources will have their volume
    * multiplied by this value.
    *
    * @param {number} volume - The value to set the volume to. Valid from 0 to 1.
    */
  def setVolume(volume: Double): Unit = js.native
}
