package typings.nickThompsonElementary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFactoriesMod {
  
  @JSImport("@nick-thompson/elementary/src/factories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nick-thompson/elementary/src/factories", "createNode")
  @js.native
  val createNode: (js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeType */ /* type */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeProps<T> */ /* props */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeChildren<T> */ /* children */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ConcreteNode<T> */ Any
  ]) & (js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeType */ /* type */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeChildren<T> */ /* children */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ConcreteNode<T> */ Any
  ]) = js.native
  
  inline def createNodeFactory[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeType */ Any */](`type`: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
