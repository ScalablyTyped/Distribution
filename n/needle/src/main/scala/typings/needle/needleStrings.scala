package typings.needle

import typings.needle.mod.core.NeedleHttpVerbs
import typings.needle.mod.core.NeedleReadWriteHttpVerbs
import typings.needle.mod.core.NeedleReadonlyHttpVerbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object needleStrings {
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait basic extends StObject
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait delete
    extends StObject
       with NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait digest extends StObject
  inline def digest: digest = "digest".asInstanceOf[digest]
  
  @js.native
  sealed trait get
    extends StObject
       with NeedleHttpVerbs
       with NeedleReadonlyHttpVerbs
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait head
    extends StObject
       with NeedleHttpVerbs
       with NeedleReadonlyHttpVerbs
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait patch
    extends StObject
       with NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait post
    extends StObject
       with NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait put
    extends StObject
       with NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait xml extends StObject
  inline def xml: xml = "xml".asInstanceOf[xml]
}
