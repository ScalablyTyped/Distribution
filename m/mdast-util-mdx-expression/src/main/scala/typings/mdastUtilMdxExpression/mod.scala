package typings.mdastUtilMdxExpression

import typings.mdast.mod.Literal
import typings.mdastUtilMdxExpression.anon.Estree
import typings.mdastUtilMdxExpression.libMod.FromMarkdownExtension
import typings.mdastUtilMdxExpression.libMod.ToMarkdownExtension
import typings.mdastUtilMdxExpression.mdastUtilMdxExpressionStrings.mdxFlowExpression
import typings.mdastUtilMdxExpression.mdastUtilMdxExpressionStrings.mdxTextExpression
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdx-expression", "mdxExpressionFromMarkdown")
  @js.native
  val mdxExpressionFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-mdx-expression", "mdxExpressionToMarkdown")
  @js.native
  val mdxExpressionToMarkdown: ToMarkdownExtension = js.native
  
  type MDXFlowExpression_ = MdxFlowExpression
  
  type MDXTextExpression_ = MdxTextExpression
  
  trait MdxFlowExpression
    extends StObject
       with Literal {
    
    /**
      * Data.
      */
    @JSName("data")
    var data_MdxFlowExpression: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    /**
      * Node type.
      */
    @JSName("type")
    var type_MdxFlowExpression: mdxFlowExpression
  }
  object MdxFlowExpression {
    
    inline def apply(value: Any): MdxFlowExpression = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxFlowExpression")
      __obj.asInstanceOf[MdxFlowExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MdxFlowExpression] (val x: Self) extends AnyVal {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxFlowExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxFlowExpressionHast
    extends StObject
       with typings.hast.mod.Literal {
    
    /**
      * Data.
      */
    @JSName("data")
    var data_MdxFlowExpressionHast: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    /**
      * Node type.
      */
    @JSName("type")
    var type_MdxFlowExpressionHast: mdxFlowExpression
  }
  object MdxFlowExpressionHast {
    
    inline def apply(value: Any): MdxFlowExpressionHast = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxFlowExpression")
      __obj.asInstanceOf[MdxFlowExpressionHast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MdxFlowExpressionHast] (val x: Self) extends AnyVal {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxFlowExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxTextExpression
    extends StObject
       with Literal {
    
    /**
      * Data.
      */
    @JSName("data")
    var data_MdxTextExpression: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    /**
      * Node type.
      */
    @JSName("type")
    var type_MdxTextExpression: mdxTextExpression
  }
  object MdxTextExpression {
    
    inline def apply(value: Any): MdxTextExpression = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxTextExpression")
      __obj.asInstanceOf[MdxTextExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MdxTextExpression] (val x: Self) extends AnyVal {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxTextExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxTextExpressionHast
    extends StObject
       with typings.hast.mod.Literal {
    
    /**
      * Data.
      */
    @JSName("data")
    var data_MdxTextExpressionHast: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    /**
      * Node type.
      */
    @JSName("type")
    var type_MdxTextExpressionHast: mdxTextExpression
  }
  object MdxTextExpressionHast {
    
    inline def apply(value: Any): MdxTextExpressionHast = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxTextExpression")
      __obj.asInstanceOf[MdxTextExpressionHast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MdxTextExpressionHast] (val x: Self) extends AnyVal {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxTextExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // Add nodes to hast content.
  /* augmented module */
  object hastAugmentingMod {
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait ElementContentMap extends StObject {
      
      /**
        * MDX expression node, occurring in flow (block).
        */
      var mdxFlowExpression: MdxFlowExpressionHast
      
      /**
        * MDX expression node, occurring in text (phrasing).
        */
      var mdxTextExpression: MdxTextExpressionHast
    }
    object ElementContentMap {
      
      inline def apply(mdxFlowExpression: MdxFlowExpressionHast, mdxTextExpression: MdxTextExpressionHast): ElementContentMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = mdxFlowExpression.asInstanceOf[js.Any], mdxTextExpression = mdxTextExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementContentMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ElementContentMap] (val x: Self) extends AnyVal {
        
        inline def setMdxFlowExpression(value: MdxFlowExpressionHast): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpression(value: MdxTextExpressionHast): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait RootContentMap extends StObject {
      
      /**
        * MDX expression node, occurring in flow (block).
        */
      var mdxFlowExpression: MdxFlowExpressionHast
      
      /**
        * MDX expression node, occurring in text (phrasing).
        */
      var mdxTextExpression: MdxTextExpressionHast
    }
    object RootContentMap {
      
      inline def apply(mdxFlowExpression: MdxFlowExpressionHast, mdxTextExpression: MdxTextExpressionHast): RootContentMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = mdxFlowExpression.asInstanceOf[js.Any], mdxTextExpression = mdxTextExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootContentMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RootContentMap] (val x: Self) extends AnyVal {
        
        inline def setMdxFlowExpression(value: MdxFlowExpressionHast): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpression(value: MdxTextExpressionHast): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
      }
    }
  }
  
  // Add nodes to mdast content.
  /* augmented module */
  object mdastAugmentingMod {
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait BlockContentMap extends StObject {
      
      /**
        * MDX expression node, occurring in flow (block).
        */
      var mdxFlowExpression: MdxFlowExpression
    }
    object BlockContentMap {
      
      inline def apply(mdxFlowExpression: MdxFlowExpression): BlockContentMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = mdxFlowExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[BlockContentMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BlockContentMap] (val x: Self) extends AnyVal {
        
        inline def setMdxFlowExpression(value: MdxFlowExpression): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait StaticPhrasingContentMap extends StObject {
      
      /**
        * MDX expression node, occurring in text (phrasing).
        */
      var mdxTextExpression: MdxTextExpression
    }
    object StaticPhrasingContentMap {
      
      inline def apply(mdxTextExpression: MdxTextExpression): StaticPhrasingContentMap = {
        val __obj = js.Dynamic.literal(mdxTextExpression = mdxTextExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[StaticPhrasingContentMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StaticPhrasingContentMap] (val x: Self) extends AnyVal {
        
        inline def setMdxTextExpression(value: MdxTextExpression): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
      }
    }
  }
}
