package typings.oidcProvider.anon

import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflookup extends StObject {
  
  def apply(
    hostname: String,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* address */ String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    family: Double,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* address */ String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    options: LookupAllOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[LookupAddress], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    options: LookupOneOptions,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* address */ String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* address */ String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
}
