```
/**
Map over promises serially.

@param input - Mapped over serially in the `mapper` function.
@param mapper - Expected to return a value. If it's a `Promise`, it's awaited before continuing with the next iteration.
@returns Fulfills when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject.
*/
```