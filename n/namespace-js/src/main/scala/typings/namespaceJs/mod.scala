package typings.namespaceJs

import typings.namespaceJs.anon.Provide
import typings.namespaceJs.mod.NamespaceJs.Definition
import typings.namespaceJs.mod.NamespaceJs.Fqn
import typings.namespaceJs.mod.NamespaceJs.UserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("namespace-js", "apply")
  @js.native
  val apply: js.Function1[/* callback */ js.Function1[/* ns */ js.Object, Unit], Unit] = js.native
  
  object global {
    
    // eslint-disable-next-line no-unnecessary-generics
    inline def Namespace[T /* <: UserObject */](fqn: Fqn): Definition[T] = js.Dynamic.global.applyDynamic("Namespace")(fqn.asInstanceOf[js.Any]).asInstanceOf[Definition[T]]
  }
  
  @JSImport("namespace-js", "use")
  @js.native
  val use: js.Function1[
    /* syntax */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends / * template literal string: ${Fqn} ${ImportName} * / string ? namespace-js.namespace-js.NamespaceJs.Application<{} & namespace-js.namespace-js.NamespaceJs.UserObject> : any extends string ? namespace-js.namespace-js.NamespaceJs.Application<namespace-js.namespace-js.NamespaceJs.DotUserObject<any, {} & namespace-js.namespace-js.NamespaceJs.UserObject>> : never */ js.Any
  ] = js.native
  
  object NamespaceJs {
    
    trait Application[T /* <: UserObject */] extends StObject {
      
      @JSName("apply")
      def apply(callback: js.Function1[/* ns */ T, Unit]): Unit
      
      def use[U /* <: UserObject */, Syntax](syntax: Syntax): /* import warning: importer.ImportType#apply Failed type conversion: Syntax extends / * template literal string: ${Fqn} ${ImportName} * / string ? namespace-js.namespace-js.NamespaceJs.Application<T & U> : Syntax extends string ? namespace-js.namespace-js.NamespaceJs.Application<namespace-js.namespace-js.NamespaceJs.DotUserObject<Syntax, T & U>> : never */ js.Any
    }
    object Application {
      
      inline def apply[T /* <: UserObject */](
        apply: js.Function1[/* ns */ T, Unit] => Unit,
        use: Any => /* import warning: importer.ImportType#apply Failed type conversion: Syntax extends / * template literal string: ${Fqn} ${ImportName} * / string ? namespace-js.namespace-js.NamespaceJs.Application<T & U> : Syntax extends string ? namespace-js.namespace-js.NamespaceJs.Application<namespace-js.namespace-js.NamespaceJs.DotUserObject<Syntax, T & U>> : never */ js.Any
      ): Application[T] = {
        val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), use = js.Any.fromFunction1(use))
        __obj.asInstanceOf[Application[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Application[?], T /* <: UserObject */] (val x: Self & Application[T]) extends AnyVal {
        
        inline def setApply(value: js.Function1[/* ns */ T, Unit] => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
        
        inline def setUse(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: Syntax extends / * template literal string: ${Fqn} ${ImportName} * / string ? namespace-js.namespace-js.NamespaceJs.Application<T & U> : Syntax extends string ? namespace-js.namespace-js.NamespaceJs.Application<namespace-js.namespace-js.NamespaceJs.DotUserObject<Syntax, T & U>> : never */ js.Any
        ): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
      }
    }
    
    trait Definition[T /* <: UserObject */] extends StObject {
      
      def define(callback: js.Function1[/* ns */ T & Provide, Unit]): Unit
    }
    object Definition {
      
      inline def apply[T /* <: UserObject */](define: js.Function1[/* ns */ T & Provide, Unit] => Unit): Definition[T] = {
        val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
        __obj.asInstanceOf[Definition[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Definition[?], T /* <: UserObject */] (val x: Self & Definition[T]) extends AnyVal {
        
        inline def setDefine(value: js.Function1[/* ns */ T & Provide, Unit] => Unit): Self = StObject.set(x, "define", js.Any.fromFunction1(value))
      }
    }
    
    // if you don't attach anything in use() function, ns is this type.
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately.
      * TS definition: {{{
      Fqn extends / * template literal string: ${inferFqn1}.${inferFqn2} * / string ? {[ P in / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fqn1 * / any ]: namespace-js.namespace-js.NamespaceJs.DotUserObject</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fqn2 * / any, UserObject>} : {[ P in std.Extract<Fqn, string> ]: {[ P in keyof UserObject ]: UserObject[P]}}
      }}}
      */
    @js.native
    trait DotUserObject[Fqn, UserObject] extends StObject
    
    type Fqn = String
    
    type ImportName = String
    
    type UserObject = js.Object
  }
}
