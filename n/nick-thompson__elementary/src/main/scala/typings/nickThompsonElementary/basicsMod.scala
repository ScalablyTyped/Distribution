package typings.nickThompsonElementary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicsMod {
  
  @JSImport("@nick-thompson/elementary/src/basics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A constant value node whose value is set by the value prop.
    * Commonly, you'll see the const node expressed as a numeric literal.
    *
    * In the following example, the two expressions are equivalent.
    * @example
    *     el.cycle(440)
    *     el.cycle(el.const({value: 440}))
    *
    * @param [props]
    * {@link core.ConstProps} object
    *
    * @returns
    * a {@link core.ConstNode} that returns the given value
    *
    * @see el
    * @see core.KeyProps
    * @see core.ConstProps
    * @see core.Child
    * @see core.ConstNode
    */
  @JSImport("@nick-thompson/elementary/src/basics", "const")
  @js.native
  val const: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'const', core.ConstProps, []> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src/basics", "counter")
  @js.native
  val counter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'counter', core.KeyProps, [pulse: core.Child]> */ Any = js.native
  
  inline def inputs(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.InNode */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inputs")().asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.InNode */ Any
  ]]
  
  inline def ms2samps(
    child: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Node */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ms2samps")(child.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def ms2samps(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ms2samps")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@nick-thompson/elementary/src/basics", "select")
  @js.native
  val select: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<core.CompositeNodeType, core.KeyProps, [signal: core.Child, high: core.Child, low: core.Child]> */ Any = js.native
  
  @JSImport("@nick-thompson/elementary/src/basics", "sr")
  @js.native
  val sr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.NodeFactory<'sr', core.KeyProps, []> */ Any = js.native
  
  inline def tau2pole(
    child: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Node */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tau2pole")(child.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def tau2pole(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tau2pole")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
}
