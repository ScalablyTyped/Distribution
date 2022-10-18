package typings.next

import typings.next.anon.Types
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildBabelPluginsNextSsgTransformMod {
  
  @JSImport("next/dist/build/babel/plugins/next-ssg-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasT: Types): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasT.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("next/dist/build/babel/plugins/next-ssg-transform", "EXPORT_NAME_GET_SERVER_PROPS")
  @js.native
  val EXPORT_NAME_GET_SERVER_PROPS: /* "getServerSideProps" */ String = js.native
  
  @JSImport("next/dist/build/babel/plugins/next-ssg-transform", "EXPORT_NAME_GET_STATIC_PATHS")
  @js.native
  val EXPORT_NAME_GET_STATIC_PATHS: /* "getStaticPaths" */ String = js.native
  
  @JSImport("next/dist/build/babel/plugins/next-ssg-transform", "EXPORT_NAME_GET_STATIC_PROPS")
  @js.native
  val EXPORT_NAME_GET_STATIC_PROPS: /* "getStaticProps" */ String = js.native
  
  trait PluginState extends StObject {
    
    var done: Boolean
    
    var isPrerender: Boolean
    
    var isServerProps: Boolean
    
    var refs: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<BabelTypes.Identifier> */ Any
      ]
  }
  object PluginState {
    
    inline def apply(
      done: Boolean,
      isPrerender: Boolean,
      isServerProps: Boolean,
      refs: Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<BabelTypes.Identifier> */ Any
        ]
    ): PluginState = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], isPrerender = isPrerender.asInstanceOf[js.Any], isServerProps = isServerProps.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginState]
    }
    
    extension [Self <: PluginState](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setIsPrerender(value: Boolean): Self = StObject.set(x, "isPrerender", value.asInstanceOf[js.Any])
      
      inline def setIsServerProps(value: Boolean): Self = StObject.set(x, "isServerProps", value.asInstanceOf[js.Any])
      
      inline def setRefs(
        value: Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<BabelTypes.Identifier> */ Any
            ]
      ): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    }
  }
}
