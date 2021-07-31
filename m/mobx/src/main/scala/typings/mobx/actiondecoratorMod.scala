package typings.mobx

import typings.mobx.anon.Configurable
import typings.mobx.anon.Enumerable
import typings.mobx.anon.Get
import typings.mobx.anon.Set
import typings.mobx.decoratorsMod.BabelDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actiondecoratorMod {
  
  @JSImport("mobx/lib/api/actiondecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("actionFieldDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit]]
  
  @scala.inline
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Get | Set | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("boundActionDecorator")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Get | Set | Null]
  @scala.inline
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Get | Set | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("boundActionDecorator")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], applyToInstance.asInstanceOf[js.Any])).asInstanceOf[Get | Set | Null]
  
  @scala.inline
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedActionDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ]]
}
