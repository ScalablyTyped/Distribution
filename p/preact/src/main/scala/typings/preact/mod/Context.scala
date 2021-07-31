package typings.preact.mod

import typings.preact.anon.Value
import typings.preact.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[T] extends StObject {
  
  def Consumer(props: RenderableProps[`0`[T], js.Any]): VNode[js.Any] | Null
  def Consumer(props: RenderableProps[`0`[T], js.Any], context: js.Any): VNode[js.Any] | Null
  @JSName("Consumer")
  var Consumer_Original: Consumer[T]
  
  def Provider(props: RenderableProps[Value[T], js.Any]): VNode[js.Any] | Null
  def Provider(props: RenderableProps[Value[T], js.Any], context: js.Any): VNode[js.Any] | Null
  @JSName("Provider")
  var Provider_Original: Provider[T]
  
  var displayName: js.UndefOr[String] = js.undefined
}
object Context {
  
  @scala.inline
  def apply[T](Consumer: Consumer[T], Provider: Provider[T]): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T]]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
    
    @scala.inline
    def setConsumer(value: Consumer[T]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProvider(value: Provider[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
