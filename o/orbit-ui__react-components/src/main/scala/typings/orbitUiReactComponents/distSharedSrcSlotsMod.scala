package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.DefaultWrapper
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcSlotsMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/slots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRawSlots(children: ReactNode, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def getSlotKey(element: ReactElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotKey")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getSlots[T /* <: SlotOptions */](children: ReactNode, param1: T): GetSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(children.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[GetSlotsReturn[T]]
  
  inline def slot[P](slotName: String, ElementType: P): P = (^.asInstanceOf[js.Dynamic].applyDynamic("slot")(slotName.asInstanceOf[js.Any], ElementType.asInstanceOf[js.Any])).asInstanceOf[P]
  
  inline def useRawSlots(children: ReactNode, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def useSlots[T /* <: SlotOptions */](children: ReactNode, slots: T): UseSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[UseSlotsReturn[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof std.Omit<T, '_'> ]:? react.react.ReactElement}
    }}}
    */
  @js.native
  trait GetSlotsReturn[T /* <: SlotOptions */] extends StObject
  
  type SlotElements = Record[String, ReactElement]
  
  trait SlotOptions extends StObject {
    
    @JSName("_")
    var _underscore: DefaultWrapper
  }
  object SlotOptions {
    
    inline def apply(_underscore: DefaultWrapper): SlotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlotOptions]
    }
    
    extension [Self <: SlotOptions](x: Self) {
      
      inline def set_underscore(value: DefaultWrapper): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SlotableType extends StObject
  
  type UseSlotsReturn[T /* <: SlotOptions */] = GetSlotsReturn[T]
}
