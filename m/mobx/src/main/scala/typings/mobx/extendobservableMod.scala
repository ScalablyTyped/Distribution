package typings.mobx

import org.scalablytyped.runtime.TopLevel
import typings.mobx.observableMod.CreateObservableOptions
import typings.mobx.observabledecoratorMod.IObservableDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendobservableMod {
  
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any]
  ): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typings.mobx.mobxStrings.extendObservable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): A with B = js.native
  @JSImport("mobx/lib/api/extendobservable", "extendObservable")
  @js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: js.UndefOr[scala.Nothing],
    decorators: js.UndefOr[scala.Nothing],
    options: CreateObservableOptions
  ): A with B = js.native
  
  @JSImport("mobx/lib/api/extendobservable", "extendObservableObjectWithProperties")
  @js.native
  def extendObservableObjectWithProperties(target: js.Any, properties: js.Any, decorators: js.Any, defaultDecorator: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/api/extendobservable", "getDefaultDecoratorFromObjectOptions")
  @js.native
  def getDefaultDecoratorFromObjectOptions(options: CreateObservableOptions): IObservableDecorator = js.native
}
