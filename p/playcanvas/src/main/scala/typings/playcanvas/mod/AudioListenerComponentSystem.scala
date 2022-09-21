package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component System for adding and removing {@link AudioComponent} objects to Entities.
  *
  * @augments ComponentSystem
  * @ignore
  */
@JSImport("playcanvas", "AudioListenerComponentSystem")
@js.native
open class AudioListenerComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[
    /* system */ AudioListenerComponentSystem, 
    /* entity */ Entity, 
    AudioListenerComponent
  ] = js.native
  
  var DataType: Instantiable0[AudioListenerComponentData] = js.native
  
  var current: Any = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  var manager: SoundManager = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  @JSName("schema")
  var schema_AudioListenerComponentSystem: js.Array[String] = js.native
}
