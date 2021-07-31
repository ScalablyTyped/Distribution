package typings.mobx

import org.scalablytyped.runtime.TopLevel
import typings.mobx.observableMod.CreateObservableOptions
import typings.mobx.observabledecoratorMod.IObservableDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendobservableMod {
  
  @JSImport("mobx/lib/api/extendobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A & B = ^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any]).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any]
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: Unit,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any]
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: Unit,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable & TopLevel[js.Any],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  @scala.inline
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: Unit, decorators: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  
  @scala.inline
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservableObjectWithProperties")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], defaultDecorator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getDefaultDecoratorFromObjectOptions(options: CreateObservableOptions): IObservableDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDecoratorFromObjectOptions")(options.asInstanceOf[js.Any]).asInstanceOf[IObservableDecorator]
}
