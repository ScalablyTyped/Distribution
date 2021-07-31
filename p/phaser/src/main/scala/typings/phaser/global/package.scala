package typings.phaser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Extends the given `myClass` object's prototype with the properties of `definition`.
  * @param ctor The constructor object to mix into.
  * @param definition A dictionary of functions for the class.
  * @param isClassDescriptor Is the definition a class descriptor?
  * @param extend The parent constructor object.
  */
@scala.inline
def extend(ctor: js.Object, definition: js.Object, isClassDescriptor: scala.Boolean): scala.Unit = (js.Dynamic.global.applyDynamic("extend")(ctor.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], isClassDescriptor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extend(ctor: js.Object, definition: js.Object, isClassDescriptor: scala.Boolean, extend: js.Object): scala.Unit = (js.Dynamic.global.applyDynamic("extend")(ctor.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], isClassDescriptor.asInstanceOf[js.Any], extend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def mixin(myClass: js.Object, mixins: js.Array[js.Object]): scala.Unit = (js.Dynamic.global.applyDynamic("mixin")(myClass.asInstanceOf[js.Any], mixins.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
/**
  * Applies the given `mixins` to the prototype of `myClass`.
  * @param myClass The constructor object to mix into.
  * @param mixins The mixins to apply to the constructor.
  */
@scala.inline
def mixin(myClass: js.Object, mixins: js.Object): scala.Unit = (js.Dynamic.global.applyDynamic("mixin")(myClass.asInstanceOf[js.Any], mixins.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
