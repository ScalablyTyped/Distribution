package typings.orbitUiReactComponents

import typings.react.mod.MutableRefObject
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseMergedRefsMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useMergedRefs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignRef[T](ref: AssignableRef[T], node: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def useMergedRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  type AssignableRef[T] = MutableRefObject[T] | RefCallback[T]
  
  @js.native
  trait MergedRef[T]
    extends RefCallback[T]
       with RefObject[T] {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* instance */ T | Null): Unit = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react.react.SetStateAction<infer U> ? U : T
    }}}
    */
  @js.native
  trait UnwrapStateType[T] extends StObject
}
