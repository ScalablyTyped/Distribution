package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.nodePgMigrateBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequencesTypesMod {
  
  type AlterSequence = js.Function2[
    /* sequenceName */ Name, 
    /* sequenceOptions */ SequenceOptionsAlter, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateSequence extends CreateSequenceFn {
    
    def reverse(sequenceName: Name): String | js.Array[String] = js.native
    def reverse(sequenceName: Name, sequenceOptions: SequenceOptionsCreate & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateSequenceFn = js.native
  }
  
  type CreateSequenceFn = js.Function2[
    /* sequenceName */ Name, 
    /* sequenceOptions */ js.UndefOr[SequenceOptionsCreate & DropOptions], 
    String | js.Array[String]
  ]
  
  type DropSequence = js.Function2[
    /* sequenceName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameSequence extends RenameSequenceFn {
    
    def reverse(oldSequenceName: Name, newSequenceName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameSequenceFn = js.native
  }
  
  type RenameSequenceFn = js.Function2[/* oldSequenceName */ Name, /* newSequenceName */ Name, String | js.Array[String]]
  
  trait SequenceOptions extends StObject {
    
    var cache: js.UndefOr[Double] = js.undefined
    
    var cycle: js.UndefOr[Boolean] = js.undefined
    
    var increment: js.UndefOr[Double] = js.undefined
    
    var maxvalue: js.UndefOr[Double | Null | `false`] = js.undefined
    
    var minvalue: js.UndefOr[Double | Null | `false`] = js.undefined
    
    var owner: js.UndefOr[String | Null | `false`] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object SequenceOptions {
    
    inline def apply(): SequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceOptions]
    }
    
    extension [Self <: SequenceOptions](x: Self) {
      
      inline def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setMaxvalue(value: Double | `false`): Self = StObject.set(x, "maxvalue", value.asInstanceOf[js.Any])
      
      inline def setMaxvalueNull: Self = StObject.set(x, "maxvalue", null)
      
      inline def setMaxvalueUndefined: Self = StObject.set(x, "maxvalue", js.undefined)
      
      inline def setMinvalue(value: Double | `false`): Self = StObject.set(x, "minvalue", value.asInstanceOf[js.Any])
      
      inline def setMinvalueNull: Self = StObject.set(x, "minvalue", null)
      
      inline def setMinvalueUndefined: Self = StObject.set(x, "minvalue", js.undefined)
      
      inline def setOwner(value: String | `false`): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SequenceOptionsAlter
    extends StObject
       with SequenceOptions {
    
    var restart: js.UndefOr[Double | `true`] = js.undefined
  }
  object SequenceOptionsAlter {
    
    inline def apply(): SequenceOptionsAlter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceOptionsAlter]
    }
    
    extension [Self <: SequenceOptionsAlter](x: Self) {
      
      inline def setRestart(value: Double | `true`): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    }
  }
  
  trait SequenceOptionsCreate
    extends StObject
       with SequenceOptions
       with IfNotExistsOption {
    
    var temporary: js.UndefOr[Boolean] = js.undefined
  }
  object SequenceOptionsCreate {
    
    inline def apply(): SequenceOptionsCreate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceOptionsCreate]
    }
    
    extension [Self <: SequenceOptionsCreate](x: Self) {
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
}
