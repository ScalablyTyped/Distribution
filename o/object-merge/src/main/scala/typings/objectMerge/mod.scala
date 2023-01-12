package typings.objectMerge

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("object-merge", JSImport.Namespace)
  @js.native
  val ^ : ObjectMerge = js.native
  
  @js.native
  trait ObjectMerge extends StObject {
    
    /**
      * Merges JavaScript objects recursively without altering the objects merged.
      * @author <a href="mailto:matthewkastor@gmail.com">Matthew Kastor</a>
      * @param [opts] An options object created by
      *  objectMerge.createOptions. Options must be specified as the first argument
      *  and must be an object created with createOptions or else the object will
      *  not be recognized as an options object and will be merged instead.
      * @param shadows [[shadows]...] One or more objects to merge. Each
      *  argument given will be treated as an object to merge. Each object
      *  overwrites the previous objects descendant properties if the property name
      *  matches. If objects properties are objects they will be merged recursively
      *  as well.
      * @returns Returns a single merged object composed from clones of the
      *  input objects.
      * @example
      *  var objectMerge = require('object-merge');
      *  var x = {
      *      a : 'a',
      *      b : 'b',
      *      c : {
      *          d : 'd',
      *          e : 'e',
      *          f : {
      *              g : 'g'
      *          }
      *      }
      *  };
      *  var y = {
      *      a : '`a',
      *      b : '`b',
      *      c : {
      *          d : '`d'
      *      }
      *  };
      *  var z = {
      *      a : {
      *          b : '``b'
      *      },
      *      fun : function foo () {
      *          return 'foo';
      *      },
      *      aps : Array.prototype.slice
      *  };
      *  var out = objectMerge(x, y, z);
      *  // out.a will be {
      *  //         b : '``b'
      *  //     }
      *  // out.b will be '`b'
      *  // out.c will be {
      *  //         d : '`d',
      *  //         e : 'e',
      *  //         f : {
      *  //             g : 'g'
      *  //         }
      *  //     }
      *  // out.fun will be a clone of z.fun
      *  // out.aps will be equal to z.aps
      */
    def apply(opts: ObjectMergeOptions, shadows: js.Object*): js.Object = js.native
    /**
      * Merges JavaScript objects recursively without altering the objects merged.
      * @author <a href="mailto:matthewkastor@gmail.com">Matthew Kastor</a>
      * @param shadows [[shadows]...] One or more objects to merge. Each
      *  argument given will be treated as an object to merge. Each object
      *  overwrites the previous objects descendant properties if the property name
      *  matches. If objects properties are objects they will be merged recursively
      *  as well.
      * @returns Returns a single merged object composed from clones of the
      *  input objects.
      * @example
      *  var objectMerge = require('object-merge');
      *  var x = {
      *      a : 'a',
      *      b : 'b',
      *      c : {
      *          d : 'd',
      *          e : 'e',
      *          f : {
      *              g : 'g'
      *          }
      *      }
      *  };
      *  var y = {
      *      a : '`a',
      *      b : '`b',
      *      c : {
      *          d : '`d'
      *      }
      *  };
      *  var z = {
      *      a : {
      *          b : '``b'
      *      },
      *      fun : function foo () {
      *          return 'foo';
      *      },
      *      aps : Array.prototype.slice
      *  };
      *  var out = objectMerge(x, y, z);
      *  // out.a will be {
      *  //         b : '``b'
      *  //     }
      *  // out.b will be '`b'
      *  // out.c will be {
      *  //         d : '`d',
      *  //         e : 'e',
      *  //         f : {
      *  //             g : 'g'
      *  //         }
      *  //     }
      *  // out.fun will be a clone of z.fun
      *  // out.aps will be equal to z.aps
      */
    def apply(shadows: js.Object*): js.Object = js.native
    
    /**
      * Creates a new options object suitable for use with objectMerge.
      * @param [opts] An object specifying the options.
      * @param [opts.depth = false] Specifies the depth to traverse objects
      *  during merging. If this is set to false then there will be no depth limit.
      * @param [opts.throwOnCircularRef = true] Set to false to suppress
      *  errors on circular references.
      * @returns Returns an instance of ObjectMergeOptions
      *  to be used with objectMerge.
      * @example
      *  var opts = objectMerge.createOptions({
      *      depth : 2,
      *      throwOnCircularRef : false
      *  });
      *  var obj1 = {
      *      a1 : {
      *          a2 : {
      *              a3 : {}
      *          }
      *      }
      *  };
      *  var obj2 = {
      *      a1 : {
      *          a2 : {
      *              a3 : 'will not be in output'
      *          },
      *          a22 : {}
      *      }
      *  };
      *  objectMerge(opts, obj1, obj2);
      */
    def createOptions(options: js.Object): ObjectMergeOptions = js.native
  }
  
  trait ObjectMergeOptions extends StObject {
    
    var depth: Double | Boolean
    
    var throwOnCircularRef: Boolean
  }
  object ObjectMergeOptions {
    
    inline def apply(depth: Double | Boolean, throwOnCircularRef: Boolean): ObjectMergeOptions = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], throwOnCircularRef = throwOnCircularRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectMergeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectMergeOptions] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: Double | Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setThrowOnCircularRef(value: Boolean): Self = StObject.set(x, "throwOnCircularRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ObjectMerge
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ObjectMerge = ^
}
