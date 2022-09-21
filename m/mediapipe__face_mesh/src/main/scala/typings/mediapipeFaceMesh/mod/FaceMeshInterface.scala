package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares the interface of FaceMesh.
  */
trait FaceMeshInterface extends StObject {
  
  def close(): js.Promise[Unit]
  
  def initialize(): js.Promise[Unit]
  
  def onResults(listener: ResultsListener): Unit
  
  def reset(): Unit
  
  def send(inputs: InputMap): js.Promise[Unit]
  
  def setOptions(options: Options): Unit
}
object FaceMeshInterface {
  
  inline def apply(
    close: () => js.Promise[Unit],
    initialize: () => js.Promise[Unit],
    onResults: ResultsListener => Unit,
    reset: () => Unit,
    send: InputMap => js.Promise[Unit],
    setOptions: Options => Unit
  ): FaceMeshInterface = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), initialize = js.Any.fromFunction0(initialize), onResults = js.Any.fromFunction1(onResults), reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction1(send), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[FaceMeshInterface]
  }
  
  extension [Self <: FaceMeshInterface](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: () => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setOnResults(value: ResultsListener => Unit): Self = StObject.set(x, "onResults", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSend(value: InputMap => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: Options => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
