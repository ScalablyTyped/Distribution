package typings.playable.anon

import typings.playable.chomecastApiMockMod.CastContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstance extends StObject {
  
  def getInstance(): CastContext
}
object GetInstance {
  
  @scala.inline
  def apply(getInstance: () => CastContext): GetInstance = {
    val __obj = js.Dynamic.literal(getInstance = js.Any.fromFunction0(getInstance))
    __obj.asInstanceOf[GetInstance]
  }
  
  @scala.inline
  implicit class GetInstanceMutableBuilder[Self <: GetInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInstance(value: () => CastContext): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
  }
}
