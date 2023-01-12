package typings.postcss.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Processors extends StObject {
  
  /**
    * Will be called on all`AtRule` nodes.
    *
    * Will be called again on node or children changes.
    */
  var AtRule: js.UndefOr[AtRuleProcessor | StringDictionary[AtRuleProcessor]] = js.undefined
  
  /**
    * Will be called on all `AtRule` nodes, when all children will be processed.
    *
    * Will be called again on node or children changes.
    */
  var AtRuleExit: js.UndefOr[AtRuleProcessor | StringDictionary[AtRuleProcessor]] = js.undefined
  
  /**
    * Will be called on all `Comment` nodes.
    *
    * Will be called again on node or children changes.
    */
  var Comment: js.UndefOr[CommentProcessor] = js.undefined
  
  /**
    * Will be called on all `Comment` nodes after listeners
    * for `Comment` event.
    *
    * Will be called again on node or children changes.
    */
  var CommentExit: js.UndefOr[CommentProcessor] = js.undefined
  
  /**
    * Will be called on all `Declaration` nodes after listeners
    * for `Declaration` event.
    *
    * Will be called again on node or children changes.
    */
  var Declaration: js.UndefOr[DeclarationProcessor | StringDictionary[DeclarationProcessor]] = js.undefined
  
  /**
    * Will be called on all `Declaration` nodes.
    *
    * Will be called again on node or children changes.
    */
  var DeclarationExit: js.UndefOr[DeclarationProcessor | StringDictionary[DeclarationProcessor]] = js.undefined
  
  /**
    * Will be called on `Document` node.
    *
    * Will be called again on children changes.
    */
  var Document: js.UndefOr[DocumentProcessor] = js.undefined
  
  /**
    * Will be called on `Document` node, when all children will be processed.
    *
    * Will be called again on children changes.
    */
  var DocumentExit: js.UndefOr[DocumentProcessor] = js.undefined
  
  /**
    * Will be called when all other listeners processed the document.
    *
    * This listener will not be called again.
    */
  var Exit: js.UndefOr[RootProcessor] = js.undefined
  
  /**
    * Will be called on `Root` node once.
    */
  var Once: js.UndefOr[RootProcessor] = js.undefined
  
  /**
    * Will be called on `Root` node once, when all children will be processed.
    */
  var OnceExit: js.UndefOr[RootProcessor] = js.undefined
  
  /**
    * Will be called on `Root` node.
    *
    * Will be called again on children changes.
    */
  var Root: js.UndefOr[RootProcessor] = js.undefined
  
  /**
    * Will be called on `Root` node, when all children will be processed.
    *
    * Will be called again on children changes.
    */
  var RootExit: js.UndefOr[RootProcessor] = js.undefined
  
  /**
    * Will be called on all `Rule` nodes.
    *
    * Will be called again on node or children changes.
    */
  var Rule: js.UndefOr[RuleProcessor] = js.undefined
  
  /**
    * Will be called on all `Rule` nodes, when all children will be processed.
    *
    * Will be called again on node or children changes.
    */
  var RuleExit: js.UndefOr[RuleProcessor] = js.undefined
}
object Processors {
  
  inline def apply(): Processors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Processors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Processors] (val x: Self) extends AnyVal {
    
    inline def setAtRule(value: AtRuleProcessor | StringDictionary[AtRuleProcessor]): Self = StObject.set(x, "AtRule", value.asInstanceOf[js.Any])
    
    inline def setAtRuleExit(value: AtRuleProcessor | StringDictionary[AtRuleProcessor]): Self = StObject.set(x, "AtRuleExit", value.asInstanceOf[js.Any])
    
    inline def setAtRuleExitFunction2(
      value: (/* atRule */ typings.postcss.libAtRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "AtRuleExit", js.Any.fromFunction2(value))
    
    inline def setAtRuleExitUndefined: Self = StObject.set(x, "AtRuleExit", js.undefined)
    
    inline def setAtRuleFunction2(
      value: (/* atRule */ typings.postcss.libAtRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "AtRule", js.Any.fromFunction2(value))
    
    inline def setAtRuleUndefined: Self = StObject.set(x, "AtRule", js.undefined)
    
    inline def setComment(
      value: (/* comment */ typings.postcss.libCommentMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Comment", js.Any.fromFunction2(value))
    
    inline def setCommentExit(
      value: (/* comment */ typings.postcss.libCommentMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "CommentExit", js.Any.fromFunction2(value))
    
    inline def setCommentExitUndefined: Self = StObject.set(x, "CommentExit", js.undefined)
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setDeclaration(value: DeclarationProcessor | StringDictionary[DeclarationProcessor]): Self = StObject.set(x, "Declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationExit(value: DeclarationProcessor | StringDictionary[DeclarationProcessor]): Self = StObject.set(x, "DeclarationExit", value.asInstanceOf[js.Any])
    
    inline def setDeclarationExitFunction2(
      value: (/* decl */ typings.postcss.libDeclarationMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "DeclarationExit", js.Any.fromFunction2(value))
    
    inline def setDeclarationExitUndefined: Self = StObject.set(x, "DeclarationExit", js.undefined)
    
    inline def setDeclarationFunction2(
      value: (/* decl */ typings.postcss.libDeclarationMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Declaration", js.Any.fromFunction2(value))
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "Declaration", js.undefined)
    
    inline def setDocument(
      value: (/* document */ typings.postcss.libDocumentMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Document", js.Any.fromFunction2(value))
    
    inline def setDocumentExit(
      value: (/* document */ typings.postcss.libDocumentMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "DocumentExit", js.Any.fromFunction2(value))
    
    inline def setDocumentExitUndefined: Self = StObject.set(x, "DocumentExit", js.undefined)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
    
    inline def setExit(
      value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "Exit", js.undefined)
    
    inline def setOnce(
      value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Once", js.Any.fromFunction2(value))
    
    inline def setOnceExit(
      value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "OnceExit", js.Any.fromFunction2(value))
    
    inline def setOnceExitUndefined: Self = StObject.set(x, "OnceExit", js.undefined)
    
    inline def setOnceUndefined: Self = StObject.set(x, "Once", js.undefined)
    
    inline def setRoot(
      value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Root", js.Any.fromFunction2(value))
    
    inline def setRootExit(
      value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "RootExit", js.Any.fromFunction2(value))
    
    inline def setRootExitUndefined: Self = StObject.set(x, "RootExit", js.undefined)
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    
    inline def setRule(
      value: (/* rule */ typings.postcss.libRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "Rule", js.Any.fromFunction2(value))
    
    inline def setRuleExit(
      value: (/* rule */ typings.postcss.libRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "RuleExit", js.Any.fromFunction2(value))
    
    inline def setRuleExitUndefined: Self = StObject.set(x, "RuleExit", js.undefined)
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
