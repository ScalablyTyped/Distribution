package typings.phaser.global.Phaser

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Circle
import typings.phaser.Phaser.Geom.Ellipse
import typings.phaser.Phaser.Geom.Line
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Geom.Triangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Actions.CallCallback
import typings.phaser.Phaser.Types.Actions.GridAlignConfig
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Actions {
  
  @JSGlobal("Phaser.Actions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Takes an array of Game Objects, or any objects that have public `x` and `y` properties, and aligns them next to each other.
    * 
    * The first item isn't moved. The second item is aligned next to the first, then the third next to the second, and so on.
    * @param items The array of items to be updated by this action.
    * @param position The position to align the items with. This is an align constant, such as `Phaser.Display.Align.LEFT_CENTER`.
    * @param offsetX Optional horizontal offset from the position. Default 0.
    * @param offsetY Optional vertical offset from the position. Default 0.
    */
  inline def AlignTo[G /* <: js.Array[GameObject] */](items: G, position: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignTo")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def AlignTo[G /* <: js.Array[GameObject] */](items: G, position: integer, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignTo")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def AlignTo[G /* <: js.Array[GameObject] */](items: G, position: integer, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignTo")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def AlignTo[G /* <: js.Array[GameObject] */](items: G, position: integer, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignTo")(items.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `angle` property,
    * and then adds the given value to each of their `angle` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `Angle(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `angle` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Angle[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Angle")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of objects and passes each of them to the given callback.
    * @param items The array of items to be updated by this action.
    * @param callback The callback to be invoked. It will be passed just one argument: the item from the array.
    * @param context The scope in which the callback will be invoked.
    */
  inline def Call[G /* <: js.Array[GameObject] */](items: G, callback: CallCallback, context: js.Any): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Call")(items.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of objects and returns the first element in the array that has properties which match
    * all of those specified in the `compare` object. For example, if the compare object was: `{ scaleX: 0.5, alpha: 1 }`
    * then it would return the first item which had the property `scaleX` set to 0.5 and `alpha` set to 1.
    * 
    * To use this with a Group: `GetFirst(group.getChildren(), compare, index)`
    * @param items The array of items to be searched by this action.
    * @param compare The comparison object. Each property in this object will be checked against the items of the array.
    * @param index An optional offset to start searching from within the items array. Default 0.
    */
  inline def GetFirst[G /* <: js.Array[GameObject] */](items: G, compare: js.Object): js.Object | GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(items.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Object | GameObject]
  inline def GetFirst[G /* <: js.Array[GameObject] */](items: G, compare: js.Object, index: integer): js.Object | GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirst")(items.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Object | GameObject]
  
  /**
    * Takes an array of objects and returns the last element in the array that has properties which match
    * all of those specified in the `compare` object. For example, if the compare object was: `{ scaleX: 0.5, alpha: 1 }`
    * then it would return the last item which had the property `scaleX` set to 0.5 and `alpha` set to 1.
    * 
    * To use this with a Group: `GetLast(group.getChildren(), compare, index)`
    * @param items The array of items to be searched by this action.
    * @param compare The comparison object. Each property in this object will be checked against the items of the array.
    * @param index An optional offset to start searching from within the items array. Default 0.
    */
  inline def GetLast[G /* <: js.Array[GameObject] */](items: G, compare: js.Object): js.Object | GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLast")(items.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Object | GameObject]
  inline def GetLast[G /* <: js.Array[GameObject] */](items: G, compare: js.Object, index: integer): js.Object | GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLast")(items.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Object | GameObject]
  
  /**
    * Takes an array of Game Objects, or any objects that have public `x` and `y` properties,
    * and then aligns them based on the grid configuration given to this action.
    * @param items The array of items to be updated by this action.
    * @param options The GridAlign Configuration object.
    */
  inline def GridAlign[G /* <: js.Array[GameObject] */](items: G, options: GridAlignConfig): G = (^.asInstanceOf[js.Dynamic].applyDynamic("GridAlign")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `alpha` property,
    * and then adds the given value to each of their `alpha` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `IncAlpha(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `alpha` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `x` property,
    * and then adds the given value to each of their `x` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `IncX(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `x` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have public `x` and `y` properties,
    * and then adds the given value to each of them.
    * 
    * The optional `stepX` and `stepY` properties are applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `IncXY(group.getChildren(), x, y, stepX, stepY)`
    * @param items The array of items to be updated by this action.
    * @param x The amount to be added to the `x` property.
    * @param y The amount to be added to the `y` property. If `undefined` or `null` it uses the `x` value. Default x.
    * @param stepX This is added to the `x` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `y` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `y` property,
    * and then adds the given value to each of their `y` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `IncY(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `y` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def IncY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("IncY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them on evenly spaced points around the perimeter of a Circle.
    * 
    * If you wish to pass a `Phaser.GameObjects.Circle` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param circle The Circle to position the Game Objects on.
    * @param startAngle Optional angle to start position from, in radians. Default 0.
    * @param endAngle Optional angle to stop position at, in radians. Default 6.28.
    */
  inline def PlaceOnCircle[G /* <: js.Array[GameObject] */](items: G, circle: Circle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnCircle")(items.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnCircle[G /* <: js.Array[GameObject] */](items: G, circle: Circle, startAngle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnCircle")(items.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnCircle[G /* <: js.Array[GameObject] */](items: G, circle: Circle, startAngle: Double, endAngle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnCircle")(items.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnCircle[G /* <: js.Array[GameObject] */](items: G, circle: Circle, startAngle: Unit, endAngle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnCircle")(items.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them on evenly spaced points around the perimeter of an Ellipse.
    * 
    * If you wish to pass a `Phaser.GameObjects.Ellipse` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param ellipse The Ellipse to position the Game Objects on.
    * @param startAngle Optional angle to start position from, in radians. Default 0.
    * @param endAngle Optional angle to stop position at, in radians. Default 6.28.
    */
  inline def PlaceOnEllipse[G /* <: js.Array[GameObject] */](items: G, ellipse: Ellipse): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnEllipse")(items.asInstanceOf[js.Any], ellipse.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnEllipse[G /* <: js.Array[GameObject] */](items: G, ellipse: Ellipse, startAngle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnEllipse")(items.asInstanceOf[js.Any], ellipse.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnEllipse[G /* <: js.Array[GameObject] */](items: G, ellipse: Ellipse, startAngle: Double, endAngle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnEllipse")(items.asInstanceOf[js.Any], ellipse.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnEllipse[G /* <: js.Array[GameObject] */](items: G, ellipse: Ellipse, startAngle: Unit, endAngle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnEllipse")(items.asInstanceOf[js.Any], ellipse.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Positions an array of Game Objects on evenly spaced points of a Line.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param line The Line to position the Game Objects on.
    */
  inline def PlaceOnLine[G /* <: js.Array[GameObject] */](items: G, line: Line): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnLine")(items.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them on evenly spaced points around the perimeter of a Rectangle.
    * 
    * Placement starts from the top-left of the rectangle, and proceeds in a clockwise direction.
    * If the `shift` parameter is given you can offset where placement begins.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param rect The Rectangle to position the Game Objects on.
    * @param shift An optional positional offset. Default 1.
    */
  inline def PlaceOnRectangle[G /* <: js.Array[GameObject] */](items: G, rect: Rectangle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnRectangle")(items.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnRectangle[G /* <: js.Array[GameObject] */](items: G, rect: Rectangle, shift: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnRectangle")(items.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them on evenly spaced points around the edges of a Triangle.
    * 
    * If you wish to pass a `Phaser.GameObjects.Triangle` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param triangle The Triangle to position the Game Objects on.
    * @param stepRate An optional step rate, to increase or decrease the packing of the Game Objects on the lines. Default 1.
    */
  inline def PlaceOnTriangle[G /* <: js.Array[GameObject] */](items: G, triangle: Triangle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnTriangle")(items.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlaceOnTriangle[G /* <: js.Array[GameObject] */](items: G, triangle: Triangle, stepRate: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaceOnTriangle")(items.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any], stepRate.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Play an animation with the given key, starting at the given startFrame on all Game Objects in items.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param key The name of the animation to play.
    * @param startFrame The starting frame of the animation with the given key.
    */
  inline def PlayAnimation[G /* <: js.Array[GameObject] */](items: G, key: String): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlayAnimation")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlayAnimation[G /* <: js.Array[GameObject] */](items: G, key: String, startFrame: String): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlayAnimation")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], startFrame.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PlayAnimation[G /* <: js.Array[GameObject] */](items: G, key: String, startFrame: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PlayAnimation")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], startFrame.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public property as defined in `key`,
    * and then adds the given value to it.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `PropertyValueInc(group.getChildren(), key, value, step)`
    * @param items The array of items to be updated by this action.
    * @param key The property to be updated.
    * @param value The amount to be added to the property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueInc[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueInc")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public property as defined in `key`,
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `PropertyValueSet(group.getChildren(), key, value, step)`
    * @param items The array of items to be updated by this action.
    * @param key The property to be updated.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def PropertyValueSet[G /* <: js.Array[GameObject] */](items: G, key: String, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("PropertyValueSet")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them at random locations within the Circle.
    * 
    * If you wish to pass a `Phaser.GameObjects.Circle` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param circle The Circle to position the Game Objects within.
    */
  inline def RandomCircle[G /* <: js.Array[GameObject] */](items: G, circle: Circle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomCircle")(items.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them at random locations within the Ellipse.
    * 
    * If you wish to pass a `Phaser.GameObjects.Ellipse` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param ellipse The Ellipse to position the Game Objects within.
    */
  inline def RandomEllipse[G /* <: js.Array[GameObject] */](items: G, ellipse: Ellipse): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomEllipse")(items.asInstanceOf[js.Any], ellipse.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them at random locations on the Line.
    * 
    * If you wish to pass a `Phaser.GameObjects.Line` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param line The Line to position the Game Objects randomly on.
    */
  inline def RandomLine[G /* <: js.Array[GameObject] */](items: G, line: Line): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomLine")(items.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them at random locations within the Rectangle.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param rect The Rectangle to position the Game Objects within.
    */
  inline def RandomRectangle[G /* <: js.Array[GameObject] */](items: G, rect: Rectangle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomRectangle")(items.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and positions them at random locations within the Triangle.
    * 
    * If you wish to pass a `Phaser.GameObjects.Triangle` Shape to this function, you should pass its `geom` property.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param triangle The Triangle to position the Game Objects within.
    */
  inline def RandomTriangle[G /* <: js.Array[GameObject] */](items: G, triangle: Triangle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomTriangle")(items.asInstanceOf[js.Any], triangle.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `rotation` property,
    * and then adds the given value to each of their `rotation` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `Rotate(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `rotation` property (in radians).
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Rotate[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Rotates each item around the given point by the given angle.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param point Any object with public `x` and `y` properties.
    * @param angle The angle to rotate by, in radians.
    */
  inline def RotateAround[G /* <: js.Array[GameObject] */](items: G, point: js.Object, angle: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAround")(items.asInstanceOf[js.Any], point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Rotates an array of Game Objects around a point by the given angle and distance.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param point Any object with public `x` and `y` properties.
    * @param angle The angle to rotate by, in radians.
    * @param distance The distance from the point of rotation in pixels.
    */
  inline def RotateAroundDistance[G /* <: js.Array[GameObject] */](items: G, point: js.Object, angle: Double, distance: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAroundDistance")(items.asInstanceOf[js.Any], point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `scaleX` property,
    * and then adds the given value to each of their `scaleX` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `ScaleX(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `scaleX` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have public `scaleX` and `scaleY` properties,
    * and then adds the given value to each of them.
    * 
    * The optional `stepX` and `stepY` properties are applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `ScaleXY(group.getChildren(), scaleX, scaleY, stepX, stepY)`
    * @param items The array of items to be updated by this action.
    * @param scaleX The amount to be added to the `scaleX` property.
    * @param scaleY The amount to be added to the `scaleY` property. If `undefined` or `null` it uses the `scaleX` value.
    * @param stepX This is added to the `scaleX` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `scaleY` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleXY[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleXY")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have a public `scaleY` property,
    * and then adds the given value to each of their `scaleY` properties.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `ScaleY(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to be added to the `scaleY` property.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def ScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("ScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `alpha`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetAlpha(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetAlpha[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetAlpha")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `blendMode`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetBlendMode(group.getChildren(), value)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetBlendMode[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetBlendMode")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetBlendMode[G /* <: js.Array[GameObject] */](items: G, value: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetBlendMode")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetBlendMode[G /* <: js.Array[GameObject] */](items: G, value: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetBlendMode")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetBlendMode[G /* <: js.Array[GameObject] */](items: G, value: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetBlendMode")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `depth`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetDepth(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetDepth[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDepth")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Passes all provided Game Objects to the Input Manager to enable them for input with identical areas and callbacks.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param hitArea Either an input configuration object, or a geometric shape that defines the hit area for the Game Object. If not specified a Rectangle will be used.
    * @param hitAreaCallback A callback to be invoked when the Game Object is interacted with. If you provide a shape you must also provide a callback.
    */
  inline def SetHitArea[G /* <: js.Array[GameObject] */](items: G, hitArea: js.Any, hitAreaCallback: HitAreaCallback): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetHitArea")(items.asInstanceOf[js.Any], hitArea.asInstanceOf[js.Any], hitAreaCallback.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public properties `originX` and `originY`
    * and then sets them to the given values.
    * 
    * The optional `stepX` and `stepY` properties are applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetOrigin(group.getChildren(), originX, originY, stepX, stepY)`
    * @param items The array of items to be updated by this action.
    * @param originX The amount to set the `originX` property to.
    * @param originY The amount to set the `originY` property to. If `undefined` or `null` it uses the `originX` value.
    * @param stepX This is added to the `originX` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `originY` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Unit,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Double, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Double,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Unit,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](items: G, originX: Double, originY: Unit, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetOrigin[G /* <: js.Array[GameObject] */](
    items: G,
    originX: Double,
    originY: Unit,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetOrigin")(items.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `rotation`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetRotation(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetRotation[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRotation")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public properties `scaleX` and `scaleY`
    * and then sets them to the given values.
    * 
    * The optional `stepX` and `stepY` properties are applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetScale(group.getChildren(), scaleX, scaleY, stepX, stepY)`
    * @param items The array of items to be updated by this action.
    * @param scaleX The amount to set the `scaleX` property to.
    * @param scaleY The amount to set the `scaleY` property to. If `undefined` or `null` it uses the `scaleX` value.
    * @param stepX This is added to the `scaleX` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `scaleY` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Double, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Double,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](items: G, scaleX: Double, scaleY: Unit, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScale[G /* <: js.Array[GameObject] */](
    items: G,
    scaleX: Double,
    scaleY: Unit,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScale")(items.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `scaleX`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetScaleX(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `scaleY`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetScaleY(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScaleY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScaleY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public properties `scrollFactorX` and `scrollFactorY`
    * and then sets them to the given values.
    * 
    * The optional `stepX` and `stepY` properties are applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetScrollFactor(group.getChildren(), scrollFactorX, scrollFactorY, stepX, stepY)`
    * @param items The array of items to be updated by this action.
    * @param scrollFactorX The amount to set the `scrollFactorX` property to.
    * @param scrollFactorY The amount to set the `scrollFactorY` property to. If `undefined` or `null` it uses the `scrollFactorX` value.
    * @param stepX This is added to the `scrollFactorX` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `scrollFactorY` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Double,
    stepY: Double,
    index: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Unit,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Double, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Double,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Double,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Double,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Double,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Double,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Unit,
    stepY: Double,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Unit,
    stepY: Double,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Unit,
    stepY: Unit,
    index: Unit,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](items: G, scrollFactorX: Double, scrollFactorY: Unit, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactor[G /* <: js.Array[GameObject] */](
    items: G,
    scrollFactorX: Double,
    scrollFactorY: Unit,
    stepX: Unit,
    stepY: Unit,
    index: integer,
    direction: integer
  ): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactor")(items.asInstanceOf[js.Any], scrollFactorX.asInstanceOf[js.Any], scrollFactorY.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `scrollFactorX`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetScrollFactorX(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `scrollFactorY`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetScrollFactorY(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetScrollFactorY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetScrollFactorY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public method setTint() and then updates it to the given value(s). You can specify tint color per corner or provide only one color value for `topLeft` parameter, in which case whole item will be tinted with that color.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param topLeft The tint being applied to top-left corner of item. If other parameters are given no value, this tint will be applied to whole item.
    * @param topRight The tint to be applied to top-right corner of item.
    * @param bottomLeft The tint to be applied to the bottom-left corner of item.
    * @param bottomRight The tint to be applied to the bottom-right corner of item.
    */
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Double, bottomLeft: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any], bottomLeft.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Double, bottomLeft: Double, bottomRight: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any], bottomLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Double, bottomLeft: Unit, bottomRight: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any], bottomLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Unit, bottomLeft: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any], bottomLeft.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Unit, bottomLeft: Double, bottomRight: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any], bottomLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetTint[G /* <: js.Array[GameObject] */](items: G, topLeft: Double, topRight: Unit, bottomLeft: Unit, bottomRight: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTint")(items.asInstanceOf[js.Any], topLeft.asInstanceOf[js.Any], topRight.asInstanceOf[js.Any], bottomLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `visible`
    * and then sets it to the given value.
    * 
    * To use this with a Group: `SetVisible(group.getChildren(), value)`
    * @param items The array of items to be updated by this action.
    * @param value The value to set the property to.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetVisible[G /* <: js.Array[GameObject] */](items: G, value: Boolean): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetVisible")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetVisible[G /* <: js.Array[GameObject] */](items: G, value: Boolean, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetVisible")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetVisible[G /* <: js.Array[GameObject] */](items: G, value: Boolean, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetVisible")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetVisible[G /* <: js.Array[GameObject] */](items: G, value: Boolean, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetVisible")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `x`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetX(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetX[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetX")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public properties `x` and `y`
    * and then sets them to the given values.
    * 
    * The optional `stepX` and `stepY` properties are applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetXY(group.getChildren(), x, y, stepX, stepY)`
    * @param items The array of items to be updated by this action.
    * @param x The amount to set the `x` property to.
    * @param y The amount to set the `y` property to. If `undefined` or `null` it uses the `x` value. Default x.
    * @param stepX This is added to the `x` amount, multiplied by the iteration counter. Default 0.
    * @param stepY This is added to the `y` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Double, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Double, stepX: Unit, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Double, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetXY[G /* <: js.Array[GameObject] */](items: G, x: Double, y: Unit, stepX: Unit, stepY: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetXY")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], stepX.asInstanceOf[js.Any], stepY.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects, or any objects that have the public property `y`
    * and then sets it to the given value.
    * 
    * The optional `step` property is applied incrementally, multiplied by each item in the array.
    * 
    * To use this with a Group: `SetY(group.getChildren(), value, step)`
    * @param items The array of items to be updated by this action.
    * @param value The amount to set the property to.
    * @param step This is added to the `value` amount, multiplied by the iteration counter. Default 0.
    * @param index An optional offset to start searching from within the items array. Default 0.
    * @param direction The direction to iterate through the array. 1 is from beginning to end, -1 from end to beginning. Default 1.
    */
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Double, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: Unit, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SetY[G /* <: js.Array[GameObject] */](items: G, value: Double, step: Unit, index: integer, direction: integer): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetY")(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], step.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Iterate through the items array changing the position of each element to be that of the element that came before
    * it in the array (or after it if direction = 1)
    * 
    * The first items position is set to x/y.
    * 
    * The final x/y coords are returned
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param x The x coordinate to place the first item in the array at.
    * @param y The y coordinate to place the first item in the array at.
    * @param direction The iteration direction. 0 = first to last and 1 = last to first. Default 0.
    * @param output An optional objec to store the final objects position in.
    */
  inline def ShiftPosition[G /* <: js.Array[GameObject] */, O /* <: Vector2 */](items: G, x: Double, y: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("ShiftPosition")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def ShiftPosition[G /* <: js.Array[GameObject] */, O /* <: Vector2 */](items: G, x: Double, y: Double, direction: Unit, output: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("ShiftPosition")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def ShiftPosition[G /* <: js.Array[GameObject] */, O /* <: Vector2 */](items: G, x: Double, y: Double, direction: integer): O = (^.asInstanceOf[js.Dynamic].applyDynamic("ShiftPosition")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def ShiftPosition[G /* <: js.Array[GameObject] */, O /* <: Vector2 */](items: G, x: Double, y: Double, direction: integer, output: O): O = (^.asInstanceOf[js.Dynamic].applyDynamic("ShiftPosition")(items.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[O]
  
  /**
    * Shuffles the array in place. The shuffled array is both modified and returned.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    */
  inline def Shuffle[G /* <: js.Array[GameObject] */](items: G): G = ^.asInstanceOf[js.Dynamic].applyDynamic("Shuffle")(items.asInstanceOf[js.Any]).asInstanceOf[G]
  
  /**
    * Smoothstep is a sigmoid-like interpolation and clamping function.
    * 
    * The function depends on three parameters, the input x, the "left edge" and the "right edge", with the left edge being assumed smaller than the right edge. The function receives a real number x as an argument and returns 0 if x is less than or equal to the left edge, 1 if x is greater than or equal to the right edge, and smoothly interpolates, using a Hermite polynomial, between 0 and 1 otherwise. The slope of the smoothstep function is zero at both edges. This is convenient for creating a sequence of transitions using smoothstep to interpolate each segment as an alternative to using more sophisticated or expensive interpolation techniques.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param property The property of the Game Object to interpolate.
    * @param min The minimum interpolation value.
    * @param max The maximum interpolation value.
    * @param inc Should the values be incremented? `true` or set (`false`) Default false.
    */
  inline def SmoothStep[G /* <: js.Array[GameObject] */](items: G, property: String, min: Double, max: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothStep")(items.asInstanceOf[js.Any], property.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SmoothStep[G /* <: js.Array[GameObject] */](items: G, property: String, min: Double, max: Double, inc: Boolean): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothStep")(items.asInstanceOf[js.Any], property.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], inc.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Smootherstep is a sigmoid-like interpolation and clamping function.
    * 
    * The function depends on three parameters, the input x, the "left edge" and the "right edge", with the left edge being assumed smaller than the right edge. The function receives a real number x as an argument and returns 0 if x is less than or equal to the left edge, 1 if x is greater than or equal to the right edge, and smoothly interpolates, using a Hermite polynomial, between 0 and 1 otherwise. The slope of the smoothstep function is zero at both edges. This is convenient for creating a sequence of transitions using smoothstep to interpolate each segment as an alternative to using more sophisticated or expensive interpolation techniques.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param property The property of the Game Object to interpolate.
    * @param min The minimum interpolation value.
    * @param max The maximum interpolation value.
    * @param inc Should the values be incremented? `true` or set (`false`) Default false.
    */
  inline def SmootherStep[G /* <: js.Array[GameObject] */](items: G, property: String, min: Double, max: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SmootherStep")(items.asInstanceOf[js.Any], property.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def SmootherStep[G /* <: js.Array[GameObject] */](items: G, property: String, min: Double, max: Double, inc: Boolean): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SmootherStep")(items.asInstanceOf[js.Any], property.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], inc.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and then modifies their `property` so the value equals, or is incremented, by the
    * calculated spread value.
    * 
    * The spread value is derived from the given `min` and `max` values and the total number of items in the array.
    * 
    * For example, to cause an array of Sprites to change in alpha from 0 to 1 you could call:
    * 
    * ```javascript
    * Phaser.Actions.Spread(itemsArray, 'alpha', 0, 1);
    * ```
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param property The property of the Game Object to spread.
    * @param min The minimum value.
    * @param max The maximum value.
    * @param inc Should the values be incremented? `true` or set (`false`) Default false.
    */
  inline def Spread[G /* <: js.Array[GameObject] */](items: G, property: String, min: Double, max: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Spread")(items.asInstanceOf[js.Any], property.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def Spread[G /* <: js.Array[GameObject] */](items: G, property: String, min: Double, max: Double, inc: Boolean): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Spread")(items.asInstanceOf[js.Any], property.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], inc.asInstanceOf[js.Any])).asInstanceOf[G]
  
  /**
    * Takes an array of Game Objects and toggles the visibility of each one.
    * Those previously `visible = false` will become `visible = true`, and vice versa.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    */
  inline def ToggleVisible[G /* <: js.Array[GameObject] */](items: G): G = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleVisible")(items.asInstanceOf[js.Any]).asInstanceOf[G]
  
  /**
    * Wrap each item's coordinates within a rectangle's area.
    * @param items An array of Game Objects. The contents of this array are updated by this Action.
    * @param rect The rectangle.
    * @param padding An amount added to each side of the rectangle during the operation. Default 0.
    */
  inline def WrapInRectangle[G /* <: js.Array[GameObject] */](items: G, rect: Rectangle): G = (^.asInstanceOf[js.Dynamic].applyDynamic("WrapInRectangle")(items.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[G]
  inline def WrapInRectangle[G /* <: js.Array[GameObject] */](items: G, rect: Rectangle, padding: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("WrapInRectangle")(items.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[G]
}
