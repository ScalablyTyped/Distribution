package typings.pathScurry

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import typings.pathScurry.pathScurryBooleans.`false`
import typings.pathScurry.pathScurryBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var withFileTypes: `false`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(withFileTypes = false)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var lstat: js.UndefOr[js.Function1[/* path */ String, js.Promise[Stats]]] = js.undefined
    
    var readdir: js.UndefOr[
        js.Function2[/* path */ String, /* options */ WithFileTypes, js.Promise[js.Array[Dirent]]]
      ] = js.undefined
    
    var readlink: js.UndefOr[js.Function1[/* path */ String, js.Promise[String]]] = js.undefined
    
    var realpath: js.UndefOr[js.Function1[/* path */ String, js.Promise[String]]] = js.undefined
  }
  object Dictk {
    
    inline def apply(): Dictk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
      
      inline def setLstat(value: /* path */ String => js.Promise[Stats]): Self = StObject.set(x, "lstat", js.Any.fromFunction1(value))
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(value: (/* path */ String, /* options */ WithFileTypes) => js.Promise[js.Array[Dirent]]): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setReadlink(value: /* path */ String => js.Promise[String]): Self = StObject.set(x, "readlink", js.Any.fromFunction1(value))
      
      inline def setReadlinkUndefined: Self = StObject.set(x, "readlink", js.undefined)
      
      inline def setRealpath(value: /* path */ String => js.Promise[String]): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    }
  }
  
  trait Lstat
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    def lstat(path: String): js.Promise[Stats]
    
    def readdir(path: String, options: WithFileTypes): js.Promise[js.Array[Dirent]]
    
    def readlink(path: String): js.Promise[String]
    
    def realpath(path: String): js.Promise[String]
  }
  object Lstat {
    
    inline def apply(
      lstat: String => js.Promise[Stats],
      readdir: (String, WithFileTypes) => js.Promise[js.Array[Dirent]],
      readlink: String => js.Promise[String],
      realpath: String => js.Promise[String]
    ): Lstat = {
      val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction1(lstat), readdir = js.Any.fromFunction2(readdir), readlink = js.Any.fromFunction1(readlink), realpath = js.Any.fromFunction1(realpath))
      __obj.asInstanceOf[Lstat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lstat] (val x: Self) extends AnyVal {
      
      inline def setLstat(value: String => js.Promise[Stats]): Self = StObject.set(x, "lstat", js.Any.fromFunction1(value))
      
      inline def setReaddir(value: (String, WithFileTypes) => js.Promise[js.Array[Dirent]]): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      inline def setReadlink(value: String => js.Promise[String]): Self = StObject.set(x, "readlink", js.Any.fromFunction1(value))
      
      inline def setRealpath(value: String => js.Promise[String]): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    }
  }
  
  trait WithFileTypes extends StObject {
    
    var withFileTypes: `true`
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[WithFileTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithFileTypes] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithFileTypesBoolean extends StObject {
    
    var withFileTypes: Boolean
  }
  object WithFileTypesBoolean {
    
    inline def apply(withFileTypes: Boolean): WithFileTypesBoolean = {
      val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithFileTypesBoolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithFileTypesBoolean] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
}
