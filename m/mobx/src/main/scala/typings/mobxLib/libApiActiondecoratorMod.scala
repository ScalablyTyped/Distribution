package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/actiondecorator", JSImport.Namespace)
@js.native
object libApiActiondecoratorMod extends js.Object {
  def actionFieldDecorator(name: java.lang.String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, scala.Unit] = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): mobxLib.Anon_ConfigurableEnumerableGet | mobxLib.Anon_ConfigurableEnumerableGetSet | scala.Null = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: scala.Boolean): mobxLib.Anon_ConfigurableEnumerableGet | mobxLib.Anon_ConfigurableEnumerableGetSet | scala.Null = js.native
  def namedActionDecorator(name: java.lang.String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ mobxLib.libUtilsDecoratorsMod.BabelDescriptor, 
    scala.Unit | mobxLib.Anon_Configurable | mobxLib.Anon_ConfigurableEnumerable
  ] = js.native
}

