package typings.postcss

import typings.postcss.anon.PartialDeclarationProps
import typings.postcss.anon.Raw
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.libNodeMod.ChildProps
import typings.postcss.postcssStrings.decl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDeclarationMod {
  
  @JSImport("postcss/lib/declaration", JSImport.Default)
  @js.native
  open class default ()
    extends Declaration
       with AnyNode
       with ChildNode {
    def this(defaults: DeclarationProps) = this()
  }
  
  @js.native
  trait Declaration
    extends typings.postcss.libNodeMod.default {
    
    def assign(overrides: DeclarationProps): this.type = js.native
    
    def clone(overrides: PartialDeclarationProps): this.type = js.native
    
    def cloneAfter(overrides: PartialDeclarationProps): this.type = js.native
    
    def cloneBefore(overrides: PartialDeclarationProps): this.type = js.native
    
    /**
      * `true` if the declaration has an `!important` annotation.
      *
      * ```js
      * const root = postcss.parse('a { color: black !important; color: red }')
      * root.first.first.important //=> true
      * root.first.last.important  //=> undefined
      * ```
      */
    var important: Boolean = js.native
    
    @JSName("parent")
    var parent_Declaration: js.UndefOr[typings.postcss.libContainerMod.default[ChildNode]] = js.native
    
    /**
      * The declaration's property name.
      *
      * ```js
      * const root = postcss.parse('a { color: black }')
      * const decl = root.first.first
      * decl.prop //=> 'color'
      * ```
      */
    var prop: String = js.native
    
    @JSName("raws")
    var raws_Declaration: DeclarationRaws = js.native
    
    @JSName("type")
    var type_Declaration: decl = js.native
    
    /**
      * The declaration’s value.
      *
      * This value will be cleaned of comments. If the source value contained
      * comments, those comments will be available in the `raws` property.
      * If you have not changed the value, the result of `decl.toString()`
      * will include the original raws value (comments and all).
      *
      * ```js
      * const root = postcss.parse('a { color: black }')
      * const decl = root.first.first
      * decl.value //=> 'black'
      * ```
      */
    var value: String = js.native
    
    /**
      * `true` if declaration is declaration of CSS Custom Property
      * or Sass variable.
      *
      * ```js
      * const root = postcss.parse(':root { --one: 1 }')
      * let one = root.first.first
      * one.variable //=> true
      * ```
      *
      * ```js
      * const root = postcss.parse('$one: 1')
      * let one = root.first
      * one.variable //=> true
      * ```
      */
    var variable: Boolean = js.native
  }
  
  trait DeclarationProps
    extends StObject
       with ChildProps {
    
    /** Whether the declaration has an `!important` annotation. */
    var important: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the declaration. */
    var prop: String
    
    /** Information used to generate byte-to-byte equal node string as it was in the origin input. */
    var raws: js.UndefOr[DeclarationRaws] = js.undefined
    
    /** Value of the declaration. */
    var value: String
  }
  object DeclarationProps {
    
    inline def apply(prop: String, value: String): DeclarationProps = {
      val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeclarationProps] (val x: Self) extends AnyVal {
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setRaws(value: DeclarationRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait DeclarationRaws extends StObject {
    
    /**
      * The space symbols before the node. It also stores `*`
      * and `_` symbols before the declaration (IE hack).
      */
    var before: js.UndefOr[String] = js.undefined
    
    /**
      * The symbols between the property and value for declarations.
      */
    var between: js.UndefOr[String] = js.undefined
    
    /**
      * The content of the important statement, if it is not just `!important`.
      */
    var important: js.UndefOr[String] = js.undefined
    
    /**
      * Declaration value with comments.
      */
    var value: js.UndefOr[Raw] = js.undefined
  }
  object DeclarationRaws {
    
    inline def apply(): DeclarationRaws = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationRaws]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeclarationRaws] (val x: Self) extends AnyVal {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBetween(value: String): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setImportant(value: String): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setValue(value: Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
