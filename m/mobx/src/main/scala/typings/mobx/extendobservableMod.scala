package typings.mobx

import org.scalablytyped.runtime.TopLevel
import typings.mobx.observableMod.CreateObservableOptions
import typings.mobx.observabledecoratorMod.IObservableDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/extendobservable", JSImport.Namespace)
@js.native
object extendobservableMod extends js.Object {
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: js.UndefOr[scala.Nothing],
    options: CreateObservableOptions
  ): A with B = js.native
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): Unit = js.native
  def getDefaultDecoratorFromObjectOptions(options: CreateObservableOptions): IObservableDecorator = js.native
}

